package p382vd;

import java.util.List;
import java.util.Map;

/* renamed from: vd.b */
/* compiled from: KCallable.kt */
public interface C12889b<R> extends C12888a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    C12895h getReturnType();

    List<Object> getTypeParameters();

    C12896i getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
