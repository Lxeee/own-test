package JsonTest;

import java.io.Serializable;
import java.util.List;

/**
 * 好友系统接收mq格式
 *
 * @author Lixyb
 * @version 1.0
 * @date 2019-12-10
 */

public class FollowFriendMqRespDTO implements Serializable {

    private String memberID;
    private int curFollowNum;
    private int maxFollowNum;
    private int leftFollowNum;
    private String type;
    private String followIDs;
    private String followNew;
    private int isBatch;
    private List<FollowSuccBean> followSucc;

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public int getCurFollowNum() {
        return curFollowNum;
    }

    public void setCurFollowNum(int curFollowNum) {
        this.curFollowNum = curFollowNum;
    }

    public int getMaxFollowNum() {
        return maxFollowNum;
    }

    public void setMaxFollowNum(int maxFollowNum) {
        this.maxFollowNum = maxFollowNum;
    }

    public int getLeftFollowNum() {
        return leftFollowNum;
    }

    public void setLeftFollowNum(int leftFollowNum) {
        this.leftFollowNum = leftFollowNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFollowIDs() {
        return followIDs;
    }

    public void setFollowIDs(String followIDs) {
        this.followIDs = followIDs;
    }

    public String getFollowNew() {
        return followNew;
    }

    public void setFollowNew(String followNew) {
        this.followNew = followNew;
    }

    public int getIsBatch() {
        return isBatch;
    }

    public void setIsBatch(int isBatch) {
        this.isBatch = isBatch;
    }

    public List<FollowSuccBean> getFollowSucc() {
        return followSucc;
    }

    public void setFollowSucc(List<FollowSuccBean> followSucc) {
        this.followSucc = followSucc;
    }

    public static class FollowSuccBean {

        private String memberID;
        private String curMemberID;
        private int followStatus;
        private int isNewRelation;
        private int isNewFollow;
        private int isNewFans;
        private String lastFollowTime;
        private String lastFansTime;

        public String getMemberID() {
            return memberID;
        }

        public void setMemberID(String memberID) {
            this.memberID = memberID;
        }

        public String getCurMemberID() {
            return curMemberID;
        }

        public void setCurMemberID(String curMemberID) {
            this.curMemberID = curMemberID;
        }

        public int getFollowStatus() {
            return followStatus;
        }

        public void setFollowStatus(int followStatus) {
            this.followStatus = followStatus;
        }

        public int getIsNewRelation() {
            return isNewRelation;
        }

        public void setIsNewRelation(int isNewRelation) {
            this.isNewRelation = isNewRelation;
        }

        public int getIsNewFollow() {
            return isNewFollow;
        }

        public void setIsNewFollow(int isNewFollow) {
            this.isNewFollow = isNewFollow;
        }

        public int getIsNewFans() {
            return isNewFans;
        }

        public void setIsNewFans(int isNewFans) {
            this.isNewFans = isNewFans;
        }

        public String getLastFollowTime() {
            return lastFollowTime;
        }

        public void setLastFollowTime(String lastFollowTime) {
            this.lastFollowTime = lastFollowTime;
        }

        public String getLastFansTime() {
            return lastFansTime;
        }

        public void setLastFansTime(String lastFansTime) {
            this.lastFansTime = lastFansTime;
        }
    }
}
