package p197be;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.C11648d;
import kotlin.coroutines.jvm.internal.C11650f;
import p243gd.C10349s;
import p272jd.C11565d;

/* renamed from: be.a */
/* compiled from: Flow.kt */
public abstract class C6744a<T> implements C6746b<T> {

    @C11650f(mo35809c = "kotlinx.coroutines.flow.AbstractFlow", mo35810f = "Flow.kt", mo35811l = {230}, mo35812m = "collect")
    /* renamed from: be.a$a */
    /* compiled from: Flow.kt */
    static final class C6745a extends C11648d {

        /* renamed from: a */
        Object f31258a;

        /* renamed from: b */
        /* synthetic */ Object f31259b;

        /* renamed from: c */
        final /* synthetic */ C6744a<T> f31260c;

        /* renamed from: d */
        int f31261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6745a(C6744a<T> aVar, C11565d<? super C6745a> dVar) {
            super(dVar);
            this.f31260c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31259b = obj;
            this.f31261d |= RecyclerView.UNDEFINED_DURATION;
            return this.f31260c.mo22667a((C6747c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo22667a(p197be.C6747c<? super T> r6, p272jd.C11565d<? super p243gd.C10349s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p197be.C6744a.C6745a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            be.a$a r0 = (p197be.C6744a.C6745a) r0
            int r1 = r0.f31261d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31261d = r1
            goto L_0x0018
        L_0x0013:
            be.a$a r0 = new be.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f31259b
            java.lang.Object r1 = p281kd.C11632d.m56711c()
            int r2 = r0.f31261d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f31258a
            ce.c r6 = (p205ce.C6860c) r6
            p243gd.C10344n.m52245b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            p243gd.C10344n.m52245b(r7)
            ce.c r7 = new ce.c
            jd.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f31258a = r7     // Catch:{ all -> 0x0055 }
            r0.f31261d = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.mo22668b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            gd.s r6 = p243gd.C10349s.f40964a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p197be.C6744a.mo22667a(be.c, jd.d):java.lang.Object");
    }

    /* renamed from: b */
    public abstract Object mo22668b(C6747c<? super T> cVar, C11565d<? super C10349s> dVar);
}
