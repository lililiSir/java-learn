package cn.lishiwei.learn.lesson_9_design.lesson_9_6_proxy;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-14.
 * @Description:
 * @Modified By:
 */
public class GamePlayProxy implements IGame {

    private GamePlayer gamePlayer = null;

    public GamePlayProxy(GamePlayer player) {
        this.gamePlayer = player;
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public void login() {
        this.gamePlayer.login();

        for(int i=0;i<5;i++){
            this.killBoss();
            this.upgrade();
        }
    }

    @Override
    public void sell() {

    }
}
