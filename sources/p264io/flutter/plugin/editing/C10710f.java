package p264io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.HashMap;
import p157w.C5861a;
import p264io.flutter.embedding.android.C10661s;
import p264io.flutter.plugin.editing.C10705c;
import p264io.flutter.plugin.platform.C10745q;
import p297mb.C11881b;
import p417zb.C13543p;

/* renamed from: io.flutter.plugin.editing.f */
/* compiled from: TextInputPlugin */
public class C10710f implements C10705c.C10707b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final View f41978a;

    /* renamed from: b */
    private final InputMethodManager f41979b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AutofillManager f41980c;

    /* renamed from: d */
    private final C13543p f41981d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10713c f41982e = new C10713c(C10713c.C10714a.NO_TARGET, 0);

    /* renamed from: f */
    private C13543p.C13545b f41983f;

    /* renamed from: g */
    private SparseArray<C13543p.C13545b> f41984g;

    /* renamed from: h */
    private C10705c f41985h;

    /* renamed from: i */
    private boolean f41986i;

    /* renamed from: j */
    private InputConnection f41987j;

    /* renamed from: k */
    private C10745q f41988k;

    /* renamed from: l */
    private Rect f41989l;

    /* renamed from: m */
    private ImeSyncDeferringInsetsCallback f41990m;

    /* renamed from: n */
    private C13543p.C13549e f41991n;

    /* renamed from: o */
    private boolean f41992o;

    /* renamed from: io.flutter.plugin.editing.f$a */
    /* compiled from: TextInputPlugin */
    class C10711a implements C13543p.C13550f {
        C10711a() {
        }

        /* renamed from: a */
        public void mo34214a(String str, Bundle bundle) {
            C10710f.this.mo34200B(str, bundle);
        }

        /* renamed from: b */
        public void mo34215b(int i, C13543p.C13545b bVar) {
            C10710f.this.mo34201D(i, bVar);
        }

        /* renamed from: c */
        public void mo34216c(C13543p.C13549e eVar) {
            C10710f fVar = C10710f.this;
            fVar.mo34202E(fVar.f41978a, eVar);
        }

        /* renamed from: d */
        public void mo34217d(int i, boolean z) {
            C10710f.this.m53588C(i, z);
        }

        /* renamed from: e */
        public void mo34218e(double d, double d2, double[] dArr) {
            C10710f.this.m53587A(d, d2, dArr);
        }

        /* renamed from: f */
        public void mo34219f() {
            C10710f.this.m53604x();
        }

        /* renamed from: g */
        public void mo34220g(boolean z) {
            if (Build.VERSION.SDK_INT >= 26 && C10710f.this.f41980c != null) {
                if (z) {
                    C10710f.this.f41980c.commit();
                } else {
                    C10710f.this.f41980c.cancel();
                }
            }
        }

        /* renamed from: h */
        public void mo34221h() {
            C10710f.this.mo34207m();
        }

        /* renamed from: i */
        public void mo34222i() {
            if (C10710f.this.f41982e.f41998a == C10713c.C10714a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                C10710f.this.m53605y();
                return;
            }
            C10710f fVar = C10710f.this;
            fVar.m53600s(fVar.f41978a);
        }

        public void show() {
            C10710f fVar = C10710f.this;
            fVar.mo34203F(fVar.f41978a);
        }
    }

    /* renamed from: io.flutter.plugin.editing.f$b */
    /* compiled from: TextInputPlugin */
    class C10712b implements C10715d {

        /* renamed from: a */
        final /* synthetic */ boolean f41994a;

        /* renamed from: b */
        final /* synthetic */ double[] f41995b;

        /* renamed from: c */
        final /* synthetic */ double[] f41996c;

        C10712b(boolean z, double[] dArr, double[] dArr2) {
            this.f41994a = z;
            this.f41995b = dArr;
            this.f41996c = dArr2;
        }

        /* renamed from: a */
        public void mo34224a(double d, double d2) {
            double d3 = 1.0d;
            if (!this.f41994a) {
                double[] dArr = this.f41995b;
                d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
            }
            double[] dArr2 = this.f41995b;
            double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
            double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
            double[] dArr3 = this.f41996c;
            if (d4 < dArr3[0]) {
                dArr3[0] = d4;
            } else if (d4 > dArr3[1]) {
                dArr3[1] = d4;
            }
            if (d5 < dArr3[2]) {
                dArr3[2] = d5;
            } else if (d5 > dArr3[3]) {
                dArr3[3] = d5;
            }
        }
    }

    /* renamed from: io.flutter.plugin.editing.f$c */
    /* compiled from: TextInputPlugin */
    private static class C10713c {

        /* renamed from: a */
        C10714a f41998a;

        /* renamed from: b */
        int f41999b;

        /* renamed from: io.flutter.plugin.editing.f$c$a */
        /* compiled from: TextInputPlugin */
        enum C10714a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public C10713c(C10714a aVar, int i) {
            this.f41998a = aVar;
            this.f41999b = i;
        }
    }

    /* renamed from: io.flutter.plugin.editing.f$d */
    /* compiled from: TextInputPlugin */
    private interface C10715d {
        /* renamed from: a */
        void mo34224a(double d, double d2);
    }

    public C10710f(View view, C13543p pVar, C10745q qVar) {
        int i = 0;
        this.f41978a = view;
        this.f41985h = new C10705c((C13543p.C13549e) null, view);
        this.f41979b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f41980c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        } else {
            this.f41980c = null;
        }
        if (i2 >= 30) {
            i = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : i;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? i | WindowInsets.Type.statusBars() : i, WindowInsets.Type.ime());
            this.f41990m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f41981d = pVar;
        pVar.mo38666n(new C10711a());
        pVar.mo38663k();
        this.f41988k = qVar;
        qVar.mo34290C(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m53587A(double d, double d2, double[] dArr) {
        double d3 = d;
        double d4 = d2;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d5 = dArr2[12] / dArr2[15];
        dArr3[1] = d5;
        dArr3[0] = d5;
        double d6 = dArr2[13] / dArr2[15];
        dArr3[3] = d6;
        dArr3[2] = d6;
        C10712b bVar = new C10712b(z, dArr2, dArr3);
        bVar.mo34224a(d3, 0.0d);
        bVar.mo34224a(d3, d4);
        bVar.mo34224a(0.0d, d4);
        Float valueOf = Float.valueOf(this.f41978a.getContext().getResources().getDisplayMetrics().density);
        this.f41989l = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m53588C(int i, boolean z) {
        if (z) {
            this.f41978a.requestFocus();
            this.f41982e = new C10713c(C10713c.C10714a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
            this.f41979b.restartInput(this.f41978a);
            this.f41986i = false;
            return;
        }
        this.f41982e = new C10713c(C10713c.C10714a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
        this.f41987j = null;
    }

    /* renamed from: H */
    private void m53589H(C13543p.C13545b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar == null || bVar.f48036j == null) {
                this.f41984g = null;
                return;
            }
            C13543p.C13545b[] bVarArr = bVar.f48038l;
            SparseArray<C13543p.C13545b> sparseArray = new SparseArray<>();
            this.f41984g = sparseArray;
            if (bVarArr == null) {
                sparseArray.put(bVar.f48036j.f48039a.hashCode(), bVar);
                return;
            }
            for (C13543p.C13545b bVar2 : bVarArr) {
                C13543p.C13545b.C13546a aVar = bVar2.f48036j;
                if (aVar != null) {
                    this.f41984g.put(aVar.f48039a.hashCode(), bVar2);
                    this.f41980c.notifyValueChanged(this.f41978a, aVar.f48039a.hashCode(), AutofillValue.forText(aVar.f48041c.f48052a));
                }
            }
        }
    }

    /* renamed from: k */
    private boolean m53598k() {
        C13543p.C13547c cVar;
        C13543p.C13545b bVar = this.f41983f;
        if (bVar == null || (cVar = bVar.f48033g) == null || cVar.f48043a != C13543p.C13551g.NONE) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m53599n(C13543p.C13549e eVar, C13543p.C13549e eVar2) {
        int i = eVar.f48056e - eVar.f48055d;
        if (i != eVar2.f48056e - eVar2.f48055d) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (eVar.f48052a.charAt(eVar.f48055d + i2) != eVar2.f48052a.charAt(eVar2.f48055d + i2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m53600s(View view) {
        m53605y();
        this.f41979b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* renamed from: t */
    private static int m53601t(C13543p.C13547c cVar, boolean z, boolean z2, boolean z3, boolean z4, C13543p.C13548d dVar) {
        C13543p.C13551g gVar = cVar.f48043a;
        if (gVar == C13543p.C13551g.DATETIME) {
            return 4;
        }
        if (gVar == C13543p.C13551g.NUMBER) {
            int i = 2;
            if (cVar.f48044b) {
                i = 4098;
            }
            return cVar.f48045c ? i | 8192 : i;
        } else if (gVar == C13543p.C13551g.PHONE) {
            return 3;
        } else {
            if (gVar == C13543p.C13551g.NONE) {
                return 0;
            }
            int i2 = 1;
            if (gVar == C13543p.C13551g.MULTILINE) {
                i2 = 131073;
            } else if (gVar == C13543p.C13551g.EMAIL_ADDRESS) {
                i2 = 33;
            } else if (gVar == C13543p.C13551g.URL) {
                i2 = 17;
            } else if (gVar == C13543p.C13551g.VISIBLE_PASSWORD) {
                i2 = 145;
            } else if (gVar == C13543p.C13551g.NAME) {
                i2 = 97;
            } else if (gVar == C13543p.C13551g.POSTAL_ADDRESS) {
                i2 = C8710R.styleable.AppCompatTheme_toolbarStyle;
            }
            if (z) {
                i2 = i2 | 524288 | 128;
            } else {
                if (z2) {
                    i2 |= 32768;
                }
                if (!z3) {
                    i2 |= 524288;
                }
            }
            if (dVar == C13543p.C13548d.CHARACTERS) {
                return i2 | 4096;
            }
            if (dVar == C13543p.C13548d.WORDS) {
                return i2 | 8192;
            }
            return dVar == C13543p.C13548d.SENTENCES ? i2 | 16384 : i2;
        }
    }

    /* renamed from: v */
    private boolean m53602v() {
        return this.f41984g != null;
    }

    /* renamed from: w */
    private void m53603w(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f41980c != null && m53602v()) {
            this.f41980c.notifyValueChanged(this.f41978a, this.f41983f.f48036j.f48039a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m53604x() {
        if (Build.VERSION.SDK_INT >= 26 && this.f41980c != null && m53602v()) {
            String str = this.f41983f.f48036j.f48039a;
            int[] iArr = new int[2];
            this.f41978a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f41989l);
            rect.offset(iArr[0], iArr[1]);
            this.f41980c.notifyViewEntered(this.f41978a, str.hashCode(), rect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m53605y() {
        C13543p.C13545b bVar;
        if (Build.VERSION.SDK_INT >= 26 && this.f41980c != null && (bVar = this.f41983f) != null && bVar.f48036j != null && m53602v()) {
            this.f41980c.notifyViewExited(this.f41978a, this.f41983f.f48036j.f48039a.hashCode());
        }
    }

    /* renamed from: B */
    public void mo34200B(String str, Bundle bundle) {
        this.f41979b.sendAppPrivateCommand(this.f41978a, str, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo34201D(int i, C13543p.C13545b bVar) {
        m53605y();
        this.f41983f = bVar;
        if (m53598k()) {
            this.f41982e = new C10713c(C10713c.C10714a.FRAMEWORK_CLIENT, i);
        } else {
            this.f41982e = new C10713c(C10713c.C10714a.NO_TARGET, i);
        }
        this.f41985h.mo34187l(this);
        C13543p.C13545b.C13546a aVar = bVar.f48036j;
        this.f41985h = new C10705c(aVar != null ? aVar.f48041c : null, this.f41978a);
        m53589H(bVar);
        this.f41986i = true;
        mo34204G();
        this.f41989l = null;
        this.f41985h.mo34178a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo34202E(View view, C13543p.C13549e eVar) {
        C13543p.C13549e eVar2;
        if (!this.f41986i && (eVar2 = this.f41991n) != null && eVar2.mo38671b()) {
            boolean n = m53599n(this.f41991n, eVar);
            this.f41986i = n;
            if (n) {
                C11881b.m57387e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f41991n = eVar;
        this.f41985h.mo34189n(eVar);
        if (this.f41986i) {
            this.f41979b.restartInput(view);
            this.f41986i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo34203F(View view) {
        if (m53598k()) {
            view.requestFocus();
            this.f41979b.showSoftInput(view, 0);
            return;
        }
        m53600s(view);
    }

    /* renamed from: G */
    public void mo34204G() {
        if (this.f41982e.f41998a == C10713c.C10714a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f41992o = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.f48056e) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34157a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.c r9 = r8.f41985h
            java.lang.String r9 = r9.toString()
            r8.m53603w(r9)
        L_0x000b:
            io.flutter.plugin.editing.c r9 = r8.f41985h
            int r9 = r9.mo34186i()
            io.flutter.plugin.editing.c r10 = r8.f41985h
            int r10 = r10.mo34185h()
            io.flutter.plugin.editing.c r11 = r8.f41985h
            int r11 = r11.mo34184g()
            io.flutter.plugin.editing.c r0 = r8.f41985h
            int r7 = r0.mo34183f()
            io.flutter.plugin.editing.c r0 = r8.f41985h
            java.util.ArrayList r0 = r0.mo34182e()
            zb.p$e r1 = r8.f41991n
            if (r1 == 0) goto L_0x0052
            io.flutter.plugin.editing.c r1 = r8.f41985h
            java.lang.String r1 = r1.toString()
            zb.p$e r2 = r8.f41991n
            java.lang.String r2 = r2.f48052a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            zb.p$e r1 = r8.f41991n
            int r2 = r1.f48053b
            if (r9 != r2) goto L_0x0050
            int r2 = r1.f48054c
            if (r10 != r2) goto L_0x0050
            int r2 = r1.f48055d
            if (r11 != r2) goto L_0x0050
            int r1 = r1.f48056e
            if (r7 != r1) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f41985h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            p297mb.C11881b.m57388f(r2, r1)
            zb.p$b r1 = r8.f41983f
            boolean r1 = r1.f48031e
            if (r1 == 0) goto L_0x0086
            zb.p r1 = r8.f41981d
            io.flutter.plugin.editing.f$c r2 = r8.f41982e
            int r2 = r2.f41999b
            r1.mo38669q(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f41985h
            r0.mo34180c()
            goto L_0x0099
        L_0x0086:
            zb.p r0 = r8.f41981d
            io.flutter.plugin.editing.f$c r1 = r8.f41982e
            int r1 = r1.f41999b
            io.flutter.plugin.editing.c r2 = r8.f41985h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.mo38668p(r1, r2, r3, r4, r5, r6)
        L_0x0099:
            zb.p$e r6 = new zb.p$e
            io.flutter.plugin.editing.c r0 = r8.f41985h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f41991n = r6
            goto L_0x00b1
        L_0x00ac:
            io.flutter.plugin.editing.c r9 = r8.f41985h
            r9.mo34180c()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugin.editing.C10710f.mo34157a(boolean, boolean, boolean):void");
    }

    /* renamed from: j */
    public void mo34205j(SparseArray<AutofillValue> sparseArray) {
        C13543p.C13545b bVar;
        C13543p.C13545b.C13546a aVar;
        C13543p.C13545b.C13546a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (bVar = this.f41983f) != null && this.f41984g != null && (aVar = bVar.f48036j) != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < sparseArray.size(); i++) {
                C13543p.C13545b bVar2 = this.f41984g.get(sparseArray.keyAt(i));
                if (!(bVar2 == null || (aVar2 = bVar2.f48036j) == null)) {
                    String charSequence = sparseArray.valueAt(i).getTextValue().toString();
                    C13543p.C13549e eVar = new C13543p.C13549e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f48039a.equals(aVar.f48039a)) {
                        this.f41985h.mo34189n(eVar);
                    } else {
                        hashMap.put(aVar2.f48039a, eVar);
                    }
                }
            }
            this.f41981d.mo38670r(this.f41982e.f41999b, hashMap);
        }
    }

    /* renamed from: l */
    public void mo34206l(int i) {
        C10713c cVar = this.f41982e;
        C10713c.C10714a aVar = cVar.f41998a;
        if ((aVar == C10713c.C10714a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == C10713c.C10714a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f41999b == i) {
            this.f41982e = new C10713c(C10713c.C10714a.NO_TARGET, 0);
            m53605y();
            this.f41979b.hideSoftInputFromWindow(this.f41978a.getApplicationWindowToken(), 0);
            this.f41979b.restartInput(this.f41978a);
            this.f41986i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo34207m() {
        if (this.f41982e.f41998a != C10713c.C10714a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f41985h.mo34187l(this);
            m53605y();
            this.f41983f = null;
            m53589H((C13543p.C13545b) null);
            this.f41982e = new C10713c(C10713c.C10714a.NO_TARGET, 0);
            mo34204G();
            this.f41989l = null;
        }
    }

    /* renamed from: o */
    public InputConnection mo34208o(View view, C10661s sVar, EditorInfo editorInfo) {
        int i;
        C10713c cVar = this.f41982e;
        C10713c.C10714a aVar = cVar.f41998a;
        if (aVar == C10713c.C10714a.NO_TARGET) {
            this.f41987j = null;
            return null;
        } else if (aVar == C10713c.C10714a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar != C10713c.C10714a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                C13543p.C13545b bVar = this.f41983f;
                int t = m53601t(bVar.f48033g, bVar.f48027a, bVar.f48028b, bVar.f48029c, bVar.f48030d, bVar.f48032f);
                editorInfo.inputType = t;
                editorInfo.imeOptions = 33554432;
                if (Build.VERSION.SDK_INT >= 26 && !this.f41983f.f48030d) {
                    editorInfo.imeOptions = 33554432 | 16777216;
                }
                Integer num = this.f41983f.f48034h;
                if (num == null) {
                    i = (t & 131072) != 0 ? 1 : 6;
                } else {
                    i = num.intValue();
                }
                C13543p.C13545b bVar2 = this.f41983f;
                String str = bVar2.f48035i;
                if (str != null) {
                    editorInfo.actionLabel = str;
                    editorInfo.actionId = i;
                }
                editorInfo.imeOptions = i | editorInfo.imeOptions;
                String[] strArr = bVar2.f48037k;
                if (strArr != null) {
                    C5861a.m34738d(editorInfo, strArr);
                }
                C10703b bVar3 = new C10703b(view, this.f41982e.f41999b, this.f41981d, sVar, this.f41985h, editorInfo);
                editorInfo.initialSelStart = this.f41985h.mo34186i();
                editorInfo.initialSelEnd = this.f41985h.mo34185h();
                this.f41987j = bVar3;
                return bVar3;
            } else if (this.f41992o) {
                return this.f41987j;
            } else {
                InputConnection onCreateInputConnection = this.f41988k.mo34281b(cVar.f41999b).onCreateInputConnection(editorInfo);
                this.f41987j = onCreateInputConnection;
                return onCreateInputConnection;
            }
        }
    }

    /* renamed from: p */
    public void mo34209p() {
        this.f41988k.mo34299L();
        this.f41981d.mo38666n((C13543p.C13550f) null);
        m53605y();
        this.f41985h.mo34187l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f41990m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* renamed from: q */
    public InputMethodManager mo34210q() {
        return this.f41979b;
    }

    /* renamed from: r */
    public boolean mo34211r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!mo34210q().isAcceptingText() || (inputConnection = this.f41987j) == null) {
            return false;
        }
        if (inputConnection instanceof C10703b) {
            return ((C10703b) inputConnection).mo34166f(keyEvent);
        }
        return inputConnection.sendKeyEvent(keyEvent);
    }

    /* renamed from: u */
    public void mo34212u() {
        if (this.f41982e.f41998a == C10713c.C10714a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f41992o = true;
        }
    }

    /* renamed from: z */
    public void mo34213z(ViewStructure viewStructure, int i) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        if (Build.VERSION.SDK_INT >= 26 && m53602v()) {
            String str = this.f41983f.f48036j.f48039a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < this.f41984g.size(); i2++) {
                int keyAt = this.f41984g.keyAt(i2);
                C13543p.C13545b.C13546a aVar = this.f41984g.valueAt(i2).f48036j;
                if (aVar != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = aVar.f48040b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f48042d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.f41989l) == null) {
                        ViewStructure viewStructure3 = newChild;
                        viewStructure3.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructure3.setAutofillValue(AutofillValue.forText(aVar.f48041c.f48052a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f41989l.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.f41985h));
                    }
                }
            }
        }
    }
}
