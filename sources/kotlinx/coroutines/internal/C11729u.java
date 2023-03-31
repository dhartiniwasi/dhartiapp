package kotlinx.coroutines.internal;

import java.util.List;
import p410yd.C13372z1;

/* renamed from: kotlinx.coroutines.internal.u */
/* compiled from: MainDispatcherFactory.kt */
public interface C11729u {
    C13372z1 createDispatcher(List<? extends C11729u> list);

    int getLoadPriority();

    String hintOnError();
}
