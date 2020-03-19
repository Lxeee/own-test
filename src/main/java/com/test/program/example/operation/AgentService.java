//package com.test.program.example.operation;
//
//import com.flexible.operationplatform.common.enums.EStationLetterContent;
//import com.flexible.operationplatform.common.enums.EStationLetterTitle;
//import com.flexible.operationplatform.dao.entity.InvoiceInfo;
//import com.flexible.operationplatform.dao.entity.MerchantInfo;
//import com.flexible.operationplatform.dao.mapper.InvoiceInfoMapper;
//import com.flexible.operationplatform.dao.mapper.MerchantInfoMapper;
//import com.flexible.operationplatform.dao.mapper.TaskInfoMapper;
//import com.flexible.operationplatform.domain.bo.InvoiceFilterBo;
//import com.flexible.operationplatform.domain.dto.InvoiceListDTO;
//import com.flexible.operationplatform.domain.dto.InvoiceUpdateDTO;
//import com.flexible.operationplatform.domain.vo.InvoiceListVo;
//import com.flexible.operationplatform.domain.vo.InvoiceVo;
//import com.flexible.operationplatform.domain.vo.ListVo;
//import com.flexible.qindynasty.exception.BusinessException;
//import com.flexible.qindynasty.result.rspenum.ERspCode;
//import com.flexible.qindynasty.util.TimeUtil;
//import com.flexible.usercenter.component.UserCenterApiProxy;
//import com.flexible.usercenter.dto.request.PostStationLetterReqDTO;
//import com.flexible.usercenter.enums.EApp;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.collections.CollectionUtils;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.BeanUtils;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
///**
// * 代理相关逻辑处理类
// *
// * @author lixyb
// * @version 1.0
// * @date 2020-03-05
// */
//@Slf4j
//@Service
//public class AgentService {
//
//    @Resource
//    private InvoiceInfoMapper invoiceInfoMapper;
//
//
//    @Resource
//    private MerchantInfoMapper merchantInfoMapper;
//
//    @Resource
//    private TaskInfoMapper taskInfoMapper;
//
//    @Resource
//    private UserCenterApiProxy userCenterApiProxy;
//
//
//    /**
//     * 根据筛选条件获取发票信息列表
//     * @param invoiceListDTO 筛选条件
//     * @return 发票列表
//     */
//    public ListVo<InvoiceListVo> getInvoiceList(InvoiceListDTO invoiceListDTO) {
//
//        log.info("InvoiceService.getInvoiceList - 请求参数 - {}", invoiceListDTO);
//
//        ListVo<InvoiceListVo> listVo = new ListVo<>();
//
//        // 封装请求实体信息
//        InvoiceFilterBo invoiceFilterBo = new InvoiceFilterBo();
//        BeanUtils.copyProperties(invoiceListDTO, invoiceFilterBo);
//        invoiceFilterBo.setOffset((invoiceListDTO.getPageNo() - 1) * invoiceListDTO.getPageSize());
//        invoiceFilterBo.setPageSize(invoiceListDTO.getPageSize());
//        if (Objects.nonNull(invoiceListDTO.getStartTime())) {
//            invoiceFilterBo.setStartTime(TimeUtil.timestamp2DateDay(invoiceListDTO.getStartTime() * 1000));
//        }
//        if (Objects.nonNull(invoiceListDTO.getEndTime())) {
//            invoiceFilterBo.setEndTime(TimeUtil.timestamp2DateDay(invoiceListDTO.getEndTime() * 1000));
//        }
//
//        // 根据商户名称获取商户ID列表
//        if (StringUtils.isNotBlank(invoiceListDTO.getMerchantName())) {
//            try {
//                List<String> merchantIds = merchantInfoMapper.queryMerchantIdByMerchantName(invoiceListDTO.getMerchantName());
//                if (merchantIds == null || merchantIds.size() == 0) {
//                    listVo.setList(null);
//                    listVo.setPageNo(invoiceListDTO.getPageNo());
//                    listVo.setPageSize(invoiceListDTO.getPageSize());
//                    listVo.setTotalCount(0);
//                    listVo.setHasMore(false);
//                    return listVo;
//                }
//                invoiceFilterBo.setMerchantId(merchantIds.get(0));
//            } catch (Exception e) {
//                log.error("queryMerchantIdByMerchantName exception {}", e);
//                throw new BusinessException(ERspCode.ERROR, "数据库操作错误");
//            }
//        }
//
//        // 获取发票列表list 数量
//        List<InvoiceInfo> invoiceInfos;
//        Integer count;
//        try {
//            invoiceInfos = invoiceInfoMapper.queryInvoiceList(invoiceFilterBo);
//            count = invoiceInfoMapper.queryInvoiceListCount(invoiceFilterBo);
//        } catch (Exception e) {
//            log.error("getInvoiceList exception {} query={}", e, invoiceFilterBo);
//            throw new BusinessException(ERspCode.ERROR, "数据库操作错误");
//        }
//
//        if (CollectionUtils.isEmpty(invoiceInfos)) {
//            log.info("InvoiceService.getInvoiceList - invoiceInfos is null");
//            throw new BusinessException(ERspCode.INVALID_PARAM, "列表为空");
//        }
//
//        // 封装invoiceVos对象
//        List<InvoiceListVo> invoiceListVos = new ArrayList<>();
//        invoiceInfos.forEach(e -> {
//            InvoiceListVo invoiceListVo = new InvoiceListVo();
//            MerchantInfo merchantInfo = merchantInfoMapper.queryByMerchantId(e.getMerchantId());
//            BeanUtils.copyProperties(e, invoiceListVo);
//            invoiceListVo.setApplicantTime(TimeUtil.dateToDateString(e.getApplicantTime()));
//            invoiceListVo.setMerchantName(Objects.isNull(merchantInfo)? "" : merchantInfo.getMerchantName());
//            invoiceListVos.add(invoiceListVo);
//        });
//
//        listVo.setList(invoiceListVos);
//        count = count == null ? 0 : count;
//        listVo.setPageSize(invoiceListDTO.getPageSize());
//        listVo.setTotalCount(count);
//
//        Integer totalPage = count % invoiceListDTO.getPageSize() == 0 ? count / invoiceListDTO.getPageSize() : count / invoiceListDTO.getPageSize() + 1;
//        listVo.setPageNo(totalPage);
//        listVo.setHasMore(totalPage > invoiceListDTO.getPageNo());
//
//        log.info("InvoiceService.getInvoiceList - 返回参数 - {}",invoiceListVos);
//        return listVo;
//    }
//
//
//    /**
//     * 根据发票ID获取发票详细信息
//     * @param invoiceId 发票ID
//     * @return 发票详细信息实体类
//     */
//    public InvoiceVo getInvoiceDetail(String invoiceId) {
//
//        // 获取发票具体信息
//        InvoiceInfo invoiceInfo;
//        try {
//            invoiceInfo = invoiceInfoMapper.queryInvoiceInfo(invoiceId);
//        } catch (Exception e) {
//            log.error("getInvoiceDetail exception {} invoiceId={}", e, invoiceId);
//            throw new BusinessException(ERspCode.ERROR, "数据库操作错误");
//        }
//
//        // 结果校验
//        if (Objects.isNull(invoiceInfo)) {
//            throw new BusinessException(ERspCode.INVALID_PARAM, "发票详情不存在");
//        }
//        InvoiceVo invoiceVo = new InvoiceVo();
//        BeanUtils.copyProperties(invoiceInfo, invoiceVo);
//        return invoiceVo;
//    }
//
//
//    /**
//     * 修改发票流转状态
//     * @param invoiceUpdateDTO 修改发票参数
//     */
//    public void updateStatus(InvoiceUpdateDTO invoiceUpdateDTO) {
//
//        Integer updateResult;
//        try {
//            updateResult = invoiceInfoMapper.updateStatus(invoiceUpdateDTO);
//        } catch (Exception e) {
//            log.error("getInvoiceDetail exception {} invoiceUpdateDTO={}", e, invoiceUpdateDTO);
//            throw new BusinessException(ERspCode.ERROR, "数据库操作错误");
//        }
//
//        if (updateResult < 0) {
//            log.info("InvoiceService.updateStatus 未进行数据修改，请检查参数");
//            throw new BusinessException(ERspCode.INVALID_PARAM, "未进行修改，请检查数据");
//        }
//
//        // 发送站内信
//        postStationLetter(invoiceUpdateDTO.getInvoiceId());
//    }
//
//    /**
//     * 发送站内信
//     * @param invoiceId invoiceId
//     */
//    public void postStationLetter(String invoiceId) {
//
//        // 获取发票信息
//        InvoiceInfo invoiceInfo = invoiceInfoMapper.queryInvoiceInfo(invoiceId);
//
//        // 发送站内信
//        PostStationLetterReqDTO postStationLetterReqDTO = new PostStationLetterReqDTO();
//        postStationLetterReqDTO.setToAppId(EApp.FLEXIBLE_MERCHANT.getAppId());
//        postStationLetterReqDTO.setToSubjectId(invoiceInfo.getMerchantId());
//        postStationLetterReqDTO.setTitle(EStationLetterTitle.INVOICE_STATUS_UPDATE.type);
//        postStationLetterReqDTO.setContent(String.format(EStationLetterContent.INVOICE_STATUS_UPDATE.type, invoiceId));
//        try {
//            userCenterApiProxy.invoke().postStationLetter(postStationLetterReqDTO);
//        } catch (Exception e) {
//            log.error("修改发票状态发送站内信失败，invoiceId = {}", invoiceInfo.getInvoiceId());
//        }
//    }
//
//}
