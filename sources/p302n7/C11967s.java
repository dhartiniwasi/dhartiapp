package p302n7;

import java.util.Arrays;
import java.util.List;

/* renamed from: n7.s */
/* compiled from: DependencyCycleException */
public class C11967s extends C11968t {

    /* renamed from: a */
    private final List<C11934c<?>> f44882a;

    public C11967s(List<C11934c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f44882a = list;
    }
}
