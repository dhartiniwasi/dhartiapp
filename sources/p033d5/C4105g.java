package p033d5;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p017b5.C1789c;
import p017b5.C1797g;
import p180z4.C6368e;

/* renamed from: d5.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4105g<T extends IInterface> extends C4087c<T> implements C2051a.C2060f, C4116j0 {

    /* renamed from: N */
    private final C4095d f23318N;

    /* renamed from: O */
    private final Set<Scope> f23319O;

    /* renamed from: P */
    private final Account f23320P;

    @Deprecated
    protected C4105g(Context context, Looper looper, int i, C4095d dVar, GoogleApiClient.C2049b bVar, GoogleApiClient.C2050c cVar) {
        this(context, looper, i, dVar, (C1789c) bVar, (C1797g) cVar);
    }

    /* renamed from: o0 */
    private final Set<Scope> m28136o0(Set<Scope> set) {
        Set<Scope> n0 = mo17392n0(set);
        for (Scope contains : n0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return n0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Executor mo17317A() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Set<Scope> mo17323G() {
        return this.f23319O;
    }

    /* renamed from: c */
    public Set<Scope> mo6932c() {
        return mo17354s() ? this.f23319O : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public Set<Scope> mo17392n0(Set<Scope> set) {
        return set;
    }

    /* renamed from: y */
    public final Account mo17358y() {
        return this.f23320P;
    }

    protected C4105g(Context context, Looper looper, int i, C4095d dVar, C1789c cVar, C1797g gVar) {
        this(context, looper, C4108h.m28149b(context), C6368e.m37415q(), i, dVar, (C1789c) C4141r.m28221k(cVar), (C1797g) C4141r.m28221k(gVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C4105g(android.content.Context r11, android.os.Looper r12, p033d5.C4108h r13, p180z4.C6368e r14, int r15, p033d5.C4095d r16, p017b5.C1789c r17, p017b5.C1797g r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            d5.h0 r3 = new d5.h0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            d5.i0 r0 = new d5.i0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo17366h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f23318N = r0
            android.accounts.Account r1 = r16.mo17359a()
            r9.f23320P = r1
            java.util.Set r0 = r16.mo17361c()
            java.util.Set r0 = r10.m28136o0(r0)
            r9.f23319O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033d5.C4105g.<init>(android.content.Context, android.os.Looper, d5.h, z4.e, int, d5.d, b5.c, b5.g):void");
    }
}
