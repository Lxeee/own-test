//package com.test.program.example.operation;
//
//import com.flexible.operationplatform.domain.dto.InvoiceDetailDTO;
//import com.flexible.operationplatform.domain.dto.InvoiceListDTO;
//import com.flexible.operationplatform.domain.dto.InvoiceUpdateDTO;
//import com.flexible.operationplatform.domain.vo.InvoiceVo;
//import com.flexible.operationplatform.service.InvoiceService;
//import com.flexible.qindynasty.result.ResultUtil;
//import com.flexible.qindynasty.result.entity.Result;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//
///**
// * 代理相关api
// *
// * @author lixyb
// * @version 1.0
// * @date 2020-03-05
// */
//@RestController
//@RequestMapping(value = "/operation/agent")
//public class AgentController {
//
//    @Resource
//    private InvoiceService invoiceService;
//
//    /**
//     * 根据筛选条件获取发票信息列表
//     * @param invoiceListDTO 筛选条件
//     * @return 发票列表
//     */
//    @RequestMapping(value = "/list")
//    public Result getInvoiceList(@RequestBody InvoiceListDTO invoiceListDTO) {
//        return ResultUtil.defaultSuccess(invoiceService.getInvoiceList(invoiceListDTO));
//    }
//
//
//    /**
//     * 根据发票ID获取发票详细信息
//     * @param invoiceDetailDTO 发票ID
//     * @return 发票详细信息实体类
//     */
//    @RequestMapping(value = "/detail")
//    public Result<InvoiceVo> getInvoiceDetail(@RequestBody @Validated InvoiceDetailDTO invoiceDetailDTO) {
//        return ResultUtil.defaultSuccess(invoiceService.getInvoiceDetail(invoiceDetailDTO.getInvoiceId()));
//    }
//
//
//    /**
//     * 修改发票流转状态
//     * @param invoiceUpdateDTO 修改发票参数
//     * @return
//     */
//    @RequestMapping(value = "/updateStatus")
//    public Result updateStatus(@RequestBody @Validated InvoiceUpdateDTO invoiceUpdateDTO) {
//        invoiceService.updateStatus(invoiceUpdateDTO);
//        return ResultUtil.defaultSuccess();
//    }
//
//
//
//
//}
