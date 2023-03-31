package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C11669k;
import p272jd.C11570g;
import p410yd.C13295f2;

/* renamed from: kotlinx.coroutines.internal.l0 */
/* compiled from: ThreadContext.kt */
final class C11713l0 {

    /* renamed from: a */
    public final C11570g f44284a;

    /* renamed from: b */
    private final Object[] f44285b;

    /* renamed from: c */
    private final C13295f2<Object>[] f44286c;

    /* renamed from: d */
    private int f44287d;

    public C11713l0(C11570g gVar, int i) {
        this.f44284a = gVar;
        this.f44285b = new Object[i];
        this.f44286c = new C13295f2[i];
    }

    /* renamed from: a */
    public final void mo35923a(C13295f2<?> f2Var, Object obj) {
        Object[] objArr = this.f44285b;
        int i = this.f44287d;
        objArr[i] = obj;
        C13295f2<Object>[] f2VarArr = this.f44286c;
        this.f44287d = i + 1;
        f2VarArr[i] = f2Var;
    }

    /* renamed from: b */
    public final void mo35924b(C11570g gVar) {
        int length = this.f44286c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C13295f2<Object> f2Var = this.f44286c[length];
                C11669k.m56784b(f2Var);
                f2Var.mo38419g(gVar, this.f44285b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
