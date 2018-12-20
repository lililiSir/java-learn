package cn.lishiwei.learn.lesson_9_design.lesson_9_6_proxy;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-14.
 * @Description:
 * @Modified By:
 */
public class GamePlayer implements IGame, IGameProduct {

    private String _userName;

    private GamePlayAgent agent = null;

    public GamePlayer(String userName) {
        this._userName = userName;
    }

    public GamePlayAgent getAgent() {
        this.agent = new GamePlayAgent(this);
        return agent;
    }

    @Override
    public void killBoss() {

        // if (agent == null) {
        //     System.out.println("请使用代理");
        //     return;
        // }

        System.out.println("玩家：" + this._userName + "杀死了一只怪物");
    }

    @Override
    public void upgrade() {
        // if (agent == null) {
        //     System.out.println("请使用代理");
        //     return;
        // }

        System.out.println("玩家：" + this._userName + "升级了");
    }

    @Override
    public void login() {
        System.out.println("玩家：" + this._userName + "登录系统");
    }

    @Override
    public void sell() {
        System.out.println("卖出一套游戏");
    }
}
