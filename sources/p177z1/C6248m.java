package p177z1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p014b2.C1633f;
import p014b2.C1658s;
import p014b2.C1660t;
import p014b2.C1673z;
import p079k3.C4881n;
import p079k3.C4882o;
import p120q2.C5374j;
import p120q2.C5376l;
import p120q2.C5385q;
import p127r2.C5440f;
import p127r2.C5441g;
import p167x3.C6074x;
import p173y3.C6133b;

/* renamed from: z1.m */
/* compiled from: DefaultRenderersFactory */
public class C6248m implements C6226h3 {

    /* renamed from: a */
    private final Context f30074a;

    /* renamed from: b */
    private final C5374j f30075b = new C5374j();

    /* renamed from: c */
    private int f30076c = 0;

    /* renamed from: d */
    private long f30077d = 5000;

    /* renamed from: e */
    private boolean f30078e;

    /* renamed from: f */
    private C5385q f30079f = C5385q.f27602a;

    /* renamed from: g */
    private boolean f30080g;

    /* renamed from: h */
    private boolean f30081h;

    /* renamed from: i */
    private boolean f30082i;

    public C6248m(Context context) {
        this.f30074a = context;
    }

    /* renamed from: a */
    public C6211d3[] mo21324a(Handler handler, C6074x xVar, C1658s sVar, C4881n nVar, C5440f fVar) {
        ArrayList arrayList = new ArrayList();
        mo21407h(this.f30074a, this.f30076c, this.f30079f, this.f30078e, handler, xVar, this.f30077d, arrayList);
        C1660t c = mo21402c(this.f30074a, this.f30080g, this.f30081h, this.f30082i);
        if (c != null) {
            mo21401b(this.f30074a, this.f30076c, this.f30079f, this.f30078e, c, handler, sVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        mo21406g(this.f30074a, nVar, handler.getLooper(), this.f30076c, arrayList2);
        mo21404e(this.f30074a, fVar, handler.getLooper(), this.f30076c, arrayList2);
        mo21403d(this.f30074a, this.f30076c, arrayList);
        Handler handler2 = handler;
        mo21405f(this.f30074a, handler, this.f30076c, arrayList);
        return (C6211d3[]) arrayList.toArray(new C6211d3[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        throw new java.lang.RuntimeException("Error instantiating MIDI extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:33:0x0097] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21401b(android.content.Context r15, int r16, p120q2.C5385q r17, boolean r18, p014b2.C1660t r19, android.os.Handler r20, p014b2.C1658s r21, java.util.ArrayList<p177z1.C6211d3> r22) {
        /*
            r14 = this;
            r0 = r16
            r9 = r22
            java.lang.Class<b2.t> r10 = p014b2.C1660t.class
            java.lang.Class<b2.s> r11 = p014b2.C1658s.class
            java.lang.String r12 = "DefaultRenderersFactory"
            b2.e0 r13 = new b2.e0
            q2.l$b r3 = r14.mo21408i()
            r1 = r13
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.add(r13)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            int r1 = r22.size()
            r2 = 2
            if (r0 != r2) goto L_0x002e
            int r1 = r1 + -1
        L_0x002e:
            r0 = 0
            java.lang.String r3 = "com.google.android.exoplayer2.decoder.midi.MidiRenderer"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            z1.d3 r3 = (p177z1.C6211d3) r3     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            int r4 = r1 + 1
            r9.add(r1, r3)     // Catch:{ ClassNotFoundException -> 0x004e, Exception -> 0x0050 }
            java.lang.String r1 = "Loaded MidiRenderer."
            p161w3.C5961r.m35212f(r12, r1)     // Catch:{ ClassNotFoundException -> 0x004e, Exception -> 0x0050 }
            goto L_0x005a
        L_0x004e:
            r1 = r4
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating MIDI extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0059:
            r4 = r1
        L_0x005a:
            r1 = 3
            r3 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r2] = r10     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r2] = r19     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            z1.d3 r5 = (p177z1.C6211d3) r5     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            int r6 = r4 + 1
            r9.add(r4, r5)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x008b }
            java.lang.String r4 = "Loaded LibopusAudioRenderer."
            p161w3.C5961r.m35212f(r12, r4)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x008b }
            goto L_0x0095
        L_0x0089:
            r4 = r6
            goto L_0x0094
        L_0x008b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0094:
            r6 = r4
        L_0x0095:
            java.lang.String r4 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r2] = r10     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r3] = r21     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r2] = r19     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Object r4 = r4.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            z1.d3 r4 = (p177z1.C6211d3) r4     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            int r5 = r6 + 1
            r9.add(r6, r4)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00c4 }
            java.lang.String r4 = "Loaded LibflacAudioRenderer."
            p161w3.C5961r.m35212f(r12, r4)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00c4 }
            goto L_0x00ce
        L_0x00c2:
            r6 = r5
            goto L_0x00cd
        L_0x00c4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00cd:
            r5 = r6
        L_0x00ce:
            java.lang.String r4 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r6[r2] = r10     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r1[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r1[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r1[r2] = r19     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Object r0 = r4.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            z1.d3 r0 = (p177z1.C6211d3) r0     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r9.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            p161w3.C5961r.m35212f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6248m.mo21401b(android.content.Context, int, q2.q, boolean, b2.t, android.os.Handler, b2.s, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1660t mo21402c(Context context, boolean z, boolean z2, boolean z3) {
        return new C1673z.C1678e().mo6633g(C1633f.m7507c(context)).mo6635i(z).mo6634h(z2).mo6636j(z3 ? 1 : 0).mo6632f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21403d(Context context, int i, ArrayList<C6211d3> arrayList) {
        arrayList.add(new C6133b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo21404e(Context context, C5440f fVar, Looper looper, int i, ArrayList<C6211d3> arrayList) {
        arrayList.add(new C5441g(fVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21405f(Context context, Handler handler, int i, ArrayList<C6211d3> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21406g(Context context, C4881n nVar, Looper looper, int i, ArrayList<C6211d3> arrayList) {
        arrayList.add(new C4882o(nVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0037] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21407h(android.content.Context r16, int r17, p120q2.C5385q r18, boolean r19, android.os.Handler r20, p167x3.C6074x r21, long r22, java.util.ArrayList<p177z1.C6211d3> r24) {
        /*
            r15 = this;
            r0 = r17
            r11 = r24
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<x3.x> r13 = p167x3.C6074x.class
            x3.h r14 = new x3.h
            q2.l$b r3 = r15.mo21408i()
            r10 = 50
            r1 = r14
            r2 = r16
            r4 = r18
            r5 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r11.add(r14)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            int r1 = r24.size()
            r2 = 2
            if (r0 != r2) goto L_0x002f
            int r1 = r1 + -1
        L_0x002f:
            r0 = 50
            r3 = 3
            r4 = 0
            r5 = 4
            r6 = 1
            java.lang.String r7 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r8[r6] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r2] = r13     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Long r9 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r6] = r20     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r2] = r21     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Object r7 = r7.newInstance(r8)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            z1.d3 r7 = (p177z1.C6211d3) r7     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            int r8 = r1 + 1
            r11.add(r1, r7)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0074 }
            java.lang.String r1 = "Loaded LibvpxVideoRenderer."
            p161w3.C5961r.m35212f(r12, r1)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0074 }
            goto L_0x007e
        L_0x0072:
            r1 = r8
            goto L_0x007d
        L_0x0074:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x007d:
            r8 = r1
        L_0x007e:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r4] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r7[r6] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r2] = r13     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r3] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r6] = r20     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r2] = r21     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r3] = r0     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Object r0 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            z1.d3 r0 = (p177z1.C6211d3) r0     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r11.add(r8, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            p161w3.C5961r.m35212f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            goto L_0x00c2
        L_0x00b9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6248m.mo21407h(android.content.Context, int, q2.q, boolean, android.os.Handler, x3.x, long, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C5376l.C5378b mo21408i() {
        return this.f30075b;
    }

    /* renamed from: j */
    public C6248m mo21409j(boolean z) {
        this.f30082i = z;
        return this;
    }
}
