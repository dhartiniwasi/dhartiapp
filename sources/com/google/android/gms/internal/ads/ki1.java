package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import p053g4.C4409t;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ki1 extends v51 {

    /* renamed from: i */
    private final Context f12104i;

    /* renamed from: j */
    private final WeakReference f12105j;

    /* renamed from: k */
    private final yg1 f12106k;

    /* renamed from: l */
    private final uj1 f12107l;

    /* renamed from: m */
    private final p61 f12108m;

    /* renamed from: n */
    private final q23 f12109n;

    /* renamed from: o */
    private final ja1 f12110o;

    /* renamed from: p */
    private boolean f12111p = false;

    ki1(u51 u51, Context context, vs0 vs0, yg1 yg1, uj1 uj1, p61 p61, q23 q23, ja1 ja1) {
        super(u51);
        this.f12104i = context;
        this.f12105j = new WeakReference(vs0);
        this.f12106k = yg1;
        this.f12107l = uj1;
        this.f12108m = p61;
        this.f12109n = q23;
        this.f12110o = ja1;
    }

    public final void finalize() throws Throwable {
        try {
            vs0 vs0 = (vs0) this.f12105j.get();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14388O5)).booleanValue()) {
                if (!this.f12111p && vs0 != null) {
                    dn0.f8329e.execute(new ji1(vs0));
                }
            } else if (vs0 != null) {
                vs0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final boolean mo11708h() {
        return this.f12108m.mo13146b();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* renamed from: i */
    public final boolean mo11709i(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.yg1 r0 = r4.f12106k
            r0.mo15437d()
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14738y0
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x004d
            p053g4.C4409t.m29326r()
            android.content.Context r0 = r4.f12104i
            boolean r0 = p073j4.C4751b2.m30608c(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.pm0.m18667g(r5)
            com.google.android.gms.internal.ads.ja1 r5 = r4.f12110o
            r5.mo8287d()
            com.google.android.gms.internal.ads.ez r5 = com.google.android.gms.internal.ads.C2679nz.f14748z0
            com.google.android.gms.internal.ads.lz r6 = p060h4.C4596v.m30088c()
            java.lang.Object r5 = r6.mo12227b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.q23 r5 = r4.f12109n
            com.google.android.gms.internal.ads.us2 r6 = r4.f18929a
            com.google.android.gms.internal.ads.ts2 r6 = r6.f18723b
            com.google.android.gms.internal.ads.ls2 r6 = r6.f18244b
            java.lang.String r6 = r6.f12930b
            r5.mo13461a(r6)
            goto L_0x0080
        L_0x004d:
            boolean r0 = r4.f12111p
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "The interstitial ad has been showed."
            com.google.android.gms.internal.ads.pm0.m18667g(r0)
            com.google.android.gms.internal.ads.ja1 r0 = r4.f12110o
            r2 = 10
            r3 = 0
            h4.z2 r2 = com.google.android.gms.internal.ads.eu2.m12271d(r2, r3, r3)
            r0.mo8289g(r2)
        L_0x0062:
            boolean r0 = r4.f12111p
            if (r0 != 0) goto L_0x0080
            if (r6 != 0) goto L_0x006a
            android.content.Context r6 = r4.f12104i
        L_0x006a:
            com.google.android.gms.internal.ads.uj1 r0 = r4.f12107l     // Catch:{ tj1 -> 0x007a }
            com.google.android.gms.internal.ads.ja1 r2 = r4.f12110o     // Catch:{ tj1 -> 0x007a }
            r0.mo10408a(r5, r6, r2)     // Catch:{ tj1 -> 0x007a }
            com.google.android.gms.internal.ads.yg1 r5 = r4.f12106k     // Catch:{ tj1 -> 0x007a }
            r5.zza()     // Catch:{ tj1 -> 0x007a }
            r5 = 1
            r4.f12111p = r5
            return r5
        L_0x007a:
            r5 = move-exception
            com.google.android.gms.internal.ads.ja1 r6 = r4.f12110o
            r6.mo8288e0(r5)
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ki1.mo11709i(boolean, android.app.Activity):boolean");
    }
}
