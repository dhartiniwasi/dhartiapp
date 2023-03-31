package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.se */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2844se implements C2807re {

    /* renamed from: B */
    protected static volatile C2993wf f17357B;

    /* renamed from: A */
    protected DisplayMetrics f17358A;

    /* renamed from: a */
    protected MotionEvent f17359a;

    /* renamed from: b */
    protected final LinkedList f17360b = new LinkedList();

    /* renamed from: c */
    protected long f17361c = 0;

    /* renamed from: d */
    protected long f17362d = 0;

    /* renamed from: e */
    protected long f17363e = 0;

    /* renamed from: f */
    protected long f17364f = 0;

    /* renamed from: g */
    protected long f17365g = 0;

    /* renamed from: h */
    protected long f17366h = 0;

    /* renamed from: i */
    protected long f17367i = 0;

    /* renamed from: r */
    protected double f17368r;

    /* renamed from: s */
    private double f17369s;

    /* renamed from: t */
    private double f17370t;

    /* renamed from: u */
    protected float f17371u;

    /* renamed from: v */
    protected float f17372v;

    /* renamed from: w */
    protected float f17373w;

    /* renamed from: x */
    protected float f17374x;

    /* renamed from: y */
    private boolean f17375y = false;

    /* renamed from: z */
    protected boolean f17376z = false;

    protected C2844se(Context context) {
        try {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14720w2)).booleanValue()) {
                C2471id.m14271d();
            } else {
                C3030xf.m23197a(f17357B);
            }
            this.f17358A = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    private final void m20270m() {
        this.f17365g = 0;
        this.f17361c = 0;
        this.f17362d = 0;
        this.f17363e = 0;
        this.f17364f = 0;
        this.f17366h = 0;
        this.f17367i = 0;
        if (this.f17360b.size() > 0) {
            Iterator it = this.f17360b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f17360b.clear();
        } else {
            MotionEvent motionEvent = this.f17359a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f17359a = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC, Splitter:B:47:0x00bc] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m20271n(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.ez r7 = com.google.android.gms.internal.ads.C2679nz.f14530d2
            com.google.android.gms.internal.ads.lz r8 = p060h4.C4596v.m30088c()
            java.lang.Object r7 = r8.mo12227b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.wf r10 = f17357B
            if (r10 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.wf r10 = f17357B
            com.google.android.gms.internal.ads.pe r10 = r10.mo14904d()
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            com.google.android.gms.internal.ads.ez r11 = com.google.android.gms.internal.ads.C2679nz.f14720w2
            com.google.android.gms.internal.ads.lz r12 = p060h4.C4596v.m30088c()
            java.lang.Object r11 = r12.mo12227b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r8 == r11) goto L_0x0043
            java.lang.String r11 = "te"
            goto L_0x0048
        L_0x0043:
            java.lang.String r11 = "be"
            goto L_0x0048
        L_0x0046:
            r10 = r9
            r11 = r10
        L_0x0048:
            r15 = 2
            r14 = 3
            if (r2 != r14) goto L_0x005f
            com.google.android.gms.internal.ads.yb r9 = r1.mo13979i(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r1.f17375y = r8     // Catch:{ Exception -> 0x0057 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r13 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            r18 = r0
            r8 = 3
            goto L_0x0091
        L_0x005c:
            r0 = move-exception
            r8 = 3
            goto L_0x008f
        L_0x005f:
            if (r2 != r15) goto L_0x006b
            com.google.android.gms.internal.ads.yb r0 = r1.mo13981k(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r3 = 1008(0x3f0, float:1.413E-42)
            r9 = r0
            r13 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0074
        L_0x006b:
            com.google.android.gms.internal.ads.yb r0 = r1.mo13980j(r0, r9)     // Catch:{ Exception -> 0x005c }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9 = r0
            r13 = 1000(0x3e8, float:1.401E-42)
        L_0x0074:
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005c }
            long r3 = r3 - r5
            r0 = -1
            r18 = 0
            r12 = r10
            r8 = 3
            r14 = r0
            r15 = r3
            r17 = r11
            r12.mo13256c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r8 = 3
        L_0x008d:
            r3 = 2
            goto L_0x00b6
        L_0x008f:
            r18 = r0
        L_0x0091:
            if (r7 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            if (r2 != r8) goto L_0x009d
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r13 = 1003(0x3eb, float:1.406E-42)
            goto L_0x00aa
        L_0x009d:
            r3 = 2
            if (r2 != r3) goto L_0x00a5
            r0 = 1009(0x3f1, float:1.414E-42)
            r13 = 1009(0x3f1, float:1.414E-42)
            goto L_0x00aa
        L_0x00a5:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r13 = 1001(0x3e9, float:1.403E-42)
        L_0x00aa:
            r14 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r5
            r12 = r10
            r17 = r11
            r12.mo13256c(r13, r14, r15, r17, r18)
        L_0x00b6:
            long r4 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.sx3 r0 = r9.mo13423m()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.pc r0 = (com.google.android.gms.internal.ads.C2730pc) r0     // Catch:{ Exception -> 0x0101 }
            int r0 = r0.mo9404l()     // Catch:{ Exception -> 0x0101 }
            if (r0 != 0) goto L_0x00c9
            goto L_0x00fb
        L_0x00c9:
            com.google.android.gms.internal.ads.sx3 r0 = r9.mo13423m()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.pc r0 = (com.google.android.gms.internal.ads.C2730pc) r0     // Catch:{ Exception -> 0x0101 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.C2471id.m14268a(r0, r6)     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x00e0
            r6 = 1006(0x3ee, float:1.41E-42)
            r13 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00eb
        L_0x00e0:
            if (r2 != r3) goto L_0x00e7
            r6 = 1010(0x3f2, float:1.415E-42)
            r13 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00eb
        L_0x00e7:
            r6 = 1004(0x3ec, float:1.407E-42)
            r13 = 1004(0x3ec, float:1.407E-42)
        L_0x00eb:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0101 }
            long r15 = r14 - r4
            r14 = -1
            r18 = 0
            r12 = r10
            r17 = r11
            r12.mo13256c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x00fb:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x0101:
            r0 = move-exception
            r18 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x0114
            r2 = 1007(0x3ef, float:1.411E-42)
            r13 = 1007(0x3ef, float:1.411E-42)
            goto L_0x011f
        L_0x0114:
            if (r2 != r3) goto L_0x011b
            r2 = 1011(0x3f3, float:1.417E-42)
            r13 = 1011(0x3f3, float:1.417E-42)
            goto L_0x011f
        L_0x011b:
            r2 = 1005(0x3ed, float:1.408E-42)
            r13 = 1005(0x3ed, float:1.408E-42)
        L_0x011f:
            r14 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r15 = r2 - r4
            r12 = r10
            r17 = r11
            r12.mo13256c(r13, r14, r15, r17, r18)
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2844se.m20271n(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* renamed from: b */
    public final String mo12591b(Context context) {
        if (!C3104zf.m24570f()) {
            return m20271n(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: c */
    public final synchronized void mo12592c(int i, int i2, int i3) {
        synchronized (this) {
            if (this.f17359a != null) {
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14510b2)).booleanValue()) {
                    m20270m();
                } else {
                    this.f17359a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f17358A;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f17359a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f17359a = null;
            }
            this.f17376z = false;
        }
    }

    /* renamed from: d */
    public final String mo12593d(Context context, String str, View view, Activity activity) {
        return m20271n(context, str, 3, view, activity, (byte[]) null);
    }

    /* renamed from: e */
    public final synchronized void mo12594e(MotionEvent motionEvent) {
        Long l;
        if (this.f17375y) {
            m20270m();
            this.f17375y = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17368r = 0.0d;
            this.f17369s = (double) motionEvent.getRawX();
            this.f17370t = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = rawX - this.f17369s;
            double d2 = rawY - this.f17370t;
            this.f17368r += Math.sqrt((d * d) + (d2 * d2));
            this.f17369s = rawX;
            this.f17370t = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f17371u = motionEvent.getX();
            this.f17372v = motionEvent.getY();
            this.f17373w = motionEvent.getRawX();
            this.f17374x = motionEvent.getRawY();
            this.f17361c++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f17359a = obtain;
            this.f17360b.add(obtain);
            if (this.f17360b.size() > 6) {
                ((MotionEvent) this.f17360b.remove()).recycle();
            }
            this.f17363e++;
            this.f17365g = mo13978h(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f17362d += (long) (motionEvent.getHistorySize() + 1);
            try {
                C3067yf l2 = mo13982l(motionEvent);
                Long l3 = l2.f20577e;
                if (!(l3 == null || l2.f20580h == null)) {
                    this.f17366h += l3.longValue() + l2.f20580h.longValue();
                }
                if (!(this.f17358A == null || (l = l2.f20578f) == null || l2.f20581i == null)) {
                    this.f17367i += l.longValue() + l2.f20581i.longValue();
                }
            } catch (C2622mf unused) {
            }
        } else if (action2 == 3) {
            this.f17364f++;
        }
        this.f17376z = true;
    }

    /* renamed from: f */
    public final String mo12595f(Context context, View view, Activity activity) {
        return m20271n(context, (String) null, 2, view, activity, (byte[]) null);
    }

    /* renamed from: g */
    public final String mo12596g(Context context, String str, View view) {
        return m20271n(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract long mo13978h(StackTraceElement[] stackTraceElementArr) throws C2622mf;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C3063yb mo13979i(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C3063yb mo13980j(Context context, C2804rb rbVar);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C3063yb mo13981k(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C3067yf mo13982l(MotionEvent motionEvent) throws C2622mf;
}
