package model.bean;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.databinding.ObservableField;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午4:42
 * Desc:
 */
public class User {
    public ObservableField<String> userName = new ObservableField<>("init username");
    public ObservableField<String> nikeName = new ObservableField<>("init nikename");

    public void reset(){
        userName.set("reset username");
        nikeName.set("reset nikename");
    }
}
