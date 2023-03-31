package p260ib;

import kotlin.jvm.internal.C11669k;
import p186ac.C6556k;
import p186ac.C6563m;

/* renamed from: ib.j */
/* compiled from: ScanResultHandler.kt */
public final class C10590j implements C6563m {

    /* renamed from: a */
    private final C6556k.C6561d f41646a;

    public C10590j(C6556k.C6561d dVar) {
        C11669k.m56787e(dVar, "result");
        this.f41646a = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r3 = 0
            byte[] r3 = new byte[r3]
            r0 = -1
            r1 = 0
            if (r4 == r0) goto L_0x004d
            java.lang.String r3 = "newBuilder()\n           …           .toByteArray()"
            if (r4 == 0) goto L_0x0035
            if (r5 == 0) goto L_0x0013
            java.lang.String r4 = "error_code"
            java.lang.String r1 = r5.getStringExtra(r4)
        L_0x0013:
            ib.h$a r4 = p260ib.C10587h.m53179f0()
            ib.g r5 = p260ib.C10585g.Error
            ib.h$a r4 = r4.mo33792G(r5)
            ib.e r5 = p260ib.C10579e.unknown
            ib.h$a r4 = r4.mo33789D(r5)
            ib.h$a r4 = r4.mo33791F(r1)
            com.google.protobuf.z r4 = r4.build()
            ib.h r4 = (p260ib.C10587h) r4
            byte[] r4 = r4.mo26773h()
            kotlin.jvm.internal.C11669k.m56786d(r4, r3)
            goto L_0x005a
        L_0x0035:
            ib.h$a r4 = p260ib.C10587h.m53179f0()
            ib.g r5 = p260ib.C10585g.Cancelled
            ib.h$a r4 = r4.mo33792G(r5)
            com.google.protobuf.z r4 = r4.build()
            ib.h r4 = (p260ib.C10587h) r4
            byte[] r4 = r4.mo26773h()
            kotlin.jvm.internal.C11669k.m56786d(r4, r3)
            goto L_0x005a
        L_0x004d:
            if (r5 == 0) goto L_0x0055
            java.lang.String r4 = "scan_result"
            byte[] r1 = r5.getByteArrayExtra(r4)
        L_0x0055:
            if (r1 != 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = r1
        L_0x0059:
            r4 = r3
        L_0x005a:
            ac.k$d r3 = r2.f41646a
            r3.success(r4)
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p260ib.C10590j.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
