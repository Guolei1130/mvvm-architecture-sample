package model;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午3:19
 * Desc:
 */
public class SwipeRefModel {

    private static final SwipeRefModel INSTANCE = new SwipeRefModel();

    private SwipeRefModel() {

    }

    public static SwipeRefModel getInstance() {
        return INSTANCE;
    }

    public Observable<Boolean> mockRefresh() {
        return Observable.just(true)
                .delay(3, TimeUnit.SECONDS);
    }
}
