package firebasetest.kwangho.com.hackertone;

/**
 * Created by nam on 2017-02-10.
 */

public class LogoWordChainListItem {
    private String myId;  //내 아이디
    private String enemyId; //상대방 아이디
    private boolean isMyTurn;   //내 공격 차례인가? true - 내 공격 차례 / false - 적 공격 차례
    private String logoName; //공격 들어온 로고 이름
    private long waitingTime;   //대기시간
    private long myAccumulatedTime; //내 총 누적 대기시간
    private long enemyAccumulatedTime;  //적 총 누적 대기시간

    public LogoWordChainListItem(String myId, String enemyId, boolean isMyTurn, String logoName, long waitingTime){
        this.myId = myId;
        this.enemyId = enemyId;
        this.isMyTurn = isMyTurn;
        this.logoName = logoName;
        this.waitingTime = waitingTime;
    }

}
