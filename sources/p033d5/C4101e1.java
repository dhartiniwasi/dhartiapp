package p033d5;

import android.os.Looper;
import android.os.Message;
import p137s5.C5489e;

/* renamed from: d5.e1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C4101e1 extends C5489e {

    /* renamed from: a */
    final /* synthetic */ C4087c f23296a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4101e1(C4087c cVar, Looper looper) {
        super(looper);
        this.f23296a = cVar;
    }

    /* renamed from: a */
    private static final void m28128a(Message message) {
        C4104f1 f1Var = (C4104f1) message.obj;
        f1Var.mo17388b();
        f1Var.mo17391e();
    }

    /* renamed from: b */
    private static final boolean m28129b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            d5.c r0 = r7.f23296a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f23249K
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m28129b(r8)
            if (r0 == 0) goto L_0x0015
            m28128a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            d5.c r0 = r7.f23296a
            boolean r0 = r0.mo17357x()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            d5.c r0 = r7.f23296a
            boolean r0 = r0.mo17344f()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            d5.c r0 = r7.f23296a
            z4.b r1 = new z4.b
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f23246H = r1
            d5.c r8 = r7.f23296a
            boolean r8 = p033d5.C4087c.m28043l0(r8)
            if (r8 == 0) goto L_0x005f
            d5.c r8 = r7.f23296a
            boolean r0 = r8.f23247I
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.m28044m0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            d5.c r8 = r7.f23296a
            z4.b r0 = r8.f23246H
            if (r0 == 0) goto L_0x006c
            z4.b r8 = r8.f23246H
            goto L_0x0071
        L_0x006c:
            z4.b r8 = new z4.b
            r8.<init>(r4)
        L_0x0071:
            d5.c r0 = r7.f23296a
            d5.c$c r0 = r0.f23265x
            r0.mo8121c(r8)
            d5.c r0 = r7.f23296a
            r0.mo17330P(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            d5.c r8 = r7.f23296a
            z4.b r0 = r8.f23246H
            if (r0 == 0) goto L_0x008d
            z4.b r8 = r8.f23246H
            goto L_0x0092
        L_0x008d:
            z4.b r8 = new z4.b
            r8.<init>(r4)
        L_0x0092:
            d5.c r0 = r7.f23296a
            d5.c$c r0 = r0.f23265x
            r0.mo8121c(r8)
            d5.c r0 = r7.f23296a
            r0.mo17330P(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            z4.b r0 = new z4.b
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            d5.c r8 = r7.f23296a
            d5.c$c r8 = r8.f23265x
            r8.mo8121c(r0)
            d5.c r8 = r7.f23296a
            r8.mo17330P(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            d5.c r0 = r7.f23296a
            r0.m28044m0(r3, (android.os.IInterface) null)
            d5.c r0 = r7.f23296a
            d5.c$a r1 = r0.f23241C
            if (r1 == 0) goto L_0x00d7
            d5.c$a r0 = r0.f23241C
            int r1 = r8.arg2
            r0.mo8532p(r1)
        L_0x00d7:
            d5.c r0 = r7.f23296a
            int r8 = r8.arg2
            r0.mo17331Q(r8)
            d5.c r8 = r7.f23296a
            p033d5.C4087c.m28042k0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            d5.c r0 = r7.f23296a
            boolean r0 = r0.mo17338a()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            m28128a(r8)
            return
        L_0x00f4:
            boolean r0 = m28129b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            d5.f1 r8 = (p033d5.C4104f1) r8
            r8.mo17389c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            m28128a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033d5.C4101e1.handleMessage(android.os.Message):void");
    }
}
