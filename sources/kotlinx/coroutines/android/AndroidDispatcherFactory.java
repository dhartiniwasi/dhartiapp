package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.C11665g;
import kotlinx.coroutines.internal.C11729u;
import p410yd.C13372z1;
import p419zd.C13590a;
import p419zd.C13592c;

/* compiled from: HandlerDispatcher.kt */
public final class AndroidDispatcherFactory implements C11729u {
    public C13372z1 createDispatcher(List<? extends C11729u> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C13590a(C13592c.m62920a(mainLooper, true), (String) null, 2, (C11665g) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
