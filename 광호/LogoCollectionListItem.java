package firebasetest.kwangho.com.hackertone;

import org.json.JSONObject;

//로고 수집 및 경험치 얻기 리스트 아이템
public class LogoCollectionListItem {
    private String userId;  //사용자 아이디
    private String logoName; //로고 이름(영문) - samsung, google...
    private int numOfCollected; //로고 수집 횟수 - 0, 1, 2, 3...
    private int level; //사용자 레벨 - 1,2,3...
    private int experience; //사용자 누적 경험치(로고 1개당 10씩 증가)
    private int maxExpirience; //레벨별 최대 경험치
    private float expirencePercent; //경험치 퍼센트

    //생성자
    public LogoCollectionListItem(String userId, String logoName, int numOfCollected){
        this.userId = userId;
        this.logoName = logoName;
        this.numOfCollected = numOfCollected;
        this.experience = this.numOfCollected * 10;
        this.level = getLevelByExperience(this.experience);
        this.maxExpirience = getMaxExpirienceByLevel(this.level);
        this.expirencePercent = computeExpirencePercentage(this.level, this.experience);
    }

    //private 메소드들
    //레벨별 최대 경험치 얻기
    private int getMaxExpirienceByLevel(int level){
        return Constant.levelMaxExpHash.get(level);
    }
    //현재 내 경험치 퍼센트 얻기
    private float computeExpirencePercentage(int level, int experience){
        int expOfRange = Constant.levelMaxExpHash.get(level) - Constant.levelMaxExpHash.get(level-1);  //구간별 필요 경험치
        int myExpOfRange = experience -  Constant.levelMaxExpHash.get(level-1); //구간별 내 경험치
        float percentage = experience / myExpOfRange;
        return percentage;
    }
    //내 현재 경험치를 통해 레벨을 얻기
    private int getLevelByExperience(int experience){
        int level;
        if(experience < Constant.levelMaxExpHash.get(1)){
            level = 1;
        }else if(experience < Constant.levelMaxExpHash.get(2)){
            level = 2;
        }else if(experience < Constant.levelMaxExpHash.get(3)){
            level = 3;
        }else if(experience < Constant.levelMaxExpHash.get(4)){
            level = 4;
        }else if(experience < Constant.levelMaxExpHash.get(5)){
            level = 5;
        }else if(experience < Constant.levelMaxExpHash.get(6)){
            level = 6;
        }else if(experience < Constant.levelMaxExpHash.get(7)){
            level = 7;
        }else if(experience < Constant.levelMaxExpHash.get(8)){
            level = 8;
        }else if(experience < Constant.levelMaxExpHash.get(9)){
            level = 9;
        }else if(experience < Constant.levelMaxExpHash.get(10)){
            level = 10;
        }else{
            level = 11;
        }
        return level;
    }

    //getter & setter
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public int getNumOfCollected() {
        return numOfCollected;
    }

    public void setNumOfCollected(int numOfCollected) {
        this.numOfCollected = numOfCollected;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMaxExpirience() {
        return maxExpirience;
    }

    public void setMaxExpirience(int maxExpirience) {
        this.maxExpirience = maxExpirience;
    }

    public float getExpirencePercent() {
        return expirencePercent;
    }

    public void setExpirencePercent(float expirencePercent) {
        this.expirencePercent = expirencePercent;
    }
}
