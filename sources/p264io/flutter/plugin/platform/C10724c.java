package p264io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.C0246h;
import androidx.core.view.C0939l0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.util.List;
import p297mb.C11881b;
import p417zb.C13510i;

/* renamed from: io.flutter.plugin.platform.c */
/* compiled from: PlatformPlugin */
public class C10724c {

    /* renamed from: a */
    private final Activity f42020a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13510i f42021b;

    /* renamed from: c */
    private final C10728d f42022c;

    /* renamed from: d */
    private C13510i.C13520j f42023d;

    /* renamed from: e */
    private int f42024e = 1280;

    /* renamed from: f */
    final C13510i.C13518h f42025f;

    /* renamed from: io.flutter.plugin.platform.c$a */
    /* compiled from: PlatformPlugin */
    class C10725a implements C13510i.C13518h {
        C10725a() {
        }

        /* renamed from: a */
        public void mo34243a() {
            C10724c.this.m53665r();
        }

        /* renamed from: b */
        public void mo34244b(List<C13510i.C13522l> list) {
            C10724c.this.m53671x(list);
        }

        /* renamed from: c */
        public void mo34245c(C13510i.C13513c cVar) {
            C10724c.this.m53668u(cVar);
        }

        /* renamed from: d */
        public CharSequence mo34246d(C13510i.C13515e eVar) {
            return C10724c.this.m53663p(eVar);
        }

        /* renamed from: e */
        public void mo34247e(String str) {
            C10724c.this.m53667t(str);
        }

        /* renamed from: f */
        public void mo34248f(C13510i.C13521k kVar) {
            C10724c.this.m53670w(kVar);
        }

        /* renamed from: g */
        public void mo34249g() {
            C10724c.this.m53669v();
        }

        /* renamed from: h */
        public void mo34250h() {
            C10724c.this.m53666s();
        }

        /* renamed from: i */
        public void mo34251i(C13510i.C13517g gVar) {
            C10724c.this.mo34241B(gVar);
        }

        /* renamed from: j */
        public void mo34252j(C13510i.C13519i iVar) {
            C10724c.this.m53664q(iVar);
        }

        /* renamed from: k */
        public void mo34253k(int i) {
            C10724c.this.m53672y(i);
        }

        /* renamed from: l */
        public void mo34254l(C13510i.C13520j jVar) {
            C10724c.this.m53673z(jVar);
        }

        /* renamed from: m */
        public boolean mo34255m() {
            return C10724c.this.m53662n();
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$b */
    /* compiled from: PlatformPlugin */
    class C10726b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f42027a;

        C10726b(View view) {
            this.f42027a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m53691b(int i) {
            if ((i & 4) == 0) {
                C10724c.this.f42021b.mo38640m(true);
            } else {
                C10724c.this.f42021b.mo38640m(false);
            }
        }

        public void onSystemUiVisibilityChange(int i) {
            this.f42027a.post(new C10729d(this, i));
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$c */
    /* compiled from: PlatformPlugin */
    static /* synthetic */ class C10727c {

        /* renamed from: a */
        static final /* synthetic */ int[] f42029a;

        /* renamed from: b */
        static final /* synthetic */ int[] f42030b;

        /* renamed from: c */
        static final /* synthetic */ int[] f42031c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                zb.i$d[] r0 = p417zb.C13510i.C13514d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42031c = r0
                r1 = 1
                zb.i$d r2 = p417zb.C13510i.C13514d.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f42031c     // Catch:{ NoSuchFieldError -> 0x001d }
                zb.i$d r3 = p417zb.C13510i.C13514d.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                zb.i$l[] r2 = p417zb.C13510i.C13522l.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f42030b = r2
                zb.i$l r3 = p417zb.C13510i.C13522l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f42030b     // Catch:{ NoSuchFieldError -> 0x0038 }
                zb.i$l r3 = p417zb.C13510i.C13522l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                zb.i$g[] r2 = p417zb.C13510i.C13517g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f42029a = r2
                zb.i$g r3 = p417zb.C13510i.C13517g.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f42029a     // Catch:{ NoSuchFieldError -> 0x0053 }
                zb.i$g r2 = p417zb.C13510i.C13517g.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f42029a     // Catch:{ NoSuchFieldError -> 0x005e }
                zb.i$g r1 = p417zb.C13510i.C13517g.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f42029a     // Catch:{ NoSuchFieldError -> 0x0069 }
                zb.i$g r1 = p417zb.C13510i.C13517g.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f42029a     // Catch:{ NoSuchFieldError -> 0x0074 }
                zb.i$g r1 = p417zb.C13510i.C13517g.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugin.platform.C10724c.C10727c.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$d */
    /* compiled from: PlatformPlugin */
    public interface C10728d {
        /* renamed from: a */
        boolean mo33854a();
    }

    public C10724c(Activity activity, C13510i iVar, C10728d dVar) {
        C10725a aVar = new C10725a();
        this.f42025f = aVar;
        this.f42020a = activity;
        this.f42021b = iVar;
        iVar.mo38639l(aVar);
        this.f42022c = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m53662n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f42020a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public CharSequence m53663p(C13510i.C13515e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f42020a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null) {
                if (eVar != C13510i.C13515e.PLAIN_TEXT) {
                    return null;
                }
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f42020a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", (Bundle) null);
            }
            return itemAt.coerceToText(this.f42020a);
        } catch (SecurityException e) {
            C11881b.m57390h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e);
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m53664q(C13510i.C13519i iVar) {
        if (iVar == C13510i.C13519i.CLICK) {
            this.f42020a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m53665r() {
        C10728d dVar = this.f42022c;
        if (dVar == null || !dVar.mo33854a()) {
            Activity activity = this.f42020a;
            if (activity instanceof C0246h) {
                ((C0246h) activity).getOnBackPressedDispatcher().mo759c();
            } else {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m53666s() {
        mo34240A();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m53667t(String str) {
        ((ClipboardManager) this.f42020a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m53668u(C13510i.C13513c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 28 && i > 21) {
                this.f42020a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f47920b, (Bitmap) null, cVar.f47919a));
            }
            if (i >= 28) {
                this.f42020a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f47920b, 0, cVar.f47919a));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m53669v() {
        View decorView = this.f42020a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new C10726b(decorView));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m53670w(C13510i.C13521k kVar) {
        int i;
        if (kVar == C13510i.C13521k.LEAN_BACK) {
            i = 1798;
        } else if (kVar == C13510i.C13521k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            i = 3846;
        } else if (kVar == C13510i.C13521k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            i = 5894;
        } else if (kVar == C13510i.C13521k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i = 1792;
        } else {
            return;
        }
        this.f42024e = i;
        mo34240A();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m53671x(List<C13510i.C13522l> list) {
        int i = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = C10727c.f42030b[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & -513 & -3;
            }
        }
        this.f42024e = i;
        mo34240A();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m53672y(int i) {
        this.f42020a.setRequestedOrientation(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m53673z(C13510i.C13520j jVar) {
        Window window = this.f42020a.getWindow();
        C0939l0 l0Var = new C0939l0(window, window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.clearFlags(201326592);
        }
        if (i >= 23) {
            C13510i.C13514d dVar = jVar.f47946b;
            if (dVar != null) {
                int i2 = C10727c.f42031c[dVar.ordinal()];
                if (i2 == 1) {
                    l0Var.mo3461b(true);
                } else if (i2 == 2) {
                    l0Var.mo3461b(false);
                }
            }
            Integer num = jVar.f47945a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f47947c;
        if (bool != null && i >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i >= 26) {
            C13510i.C13514d dVar2 = jVar.f47949e;
            if (dVar2 != null) {
                int i3 = C10727c.f42031c[dVar2.ordinal()];
                if (i3 == 1) {
                    l0Var.mo3460a(true);
                } else if (i3 == 2) {
                    l0Var.mo3460a(false);
                }
            }
            Integer num2 = jVar.f47948d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f47950f;
        if (num3 != null && i >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f47951g;
        if (bool2 != null && i >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f42023d = jVar;
    }

    /* renamed from: A */
    public void mo34240A() {
        this.f42020a.getWindow().getDecorView().setSystemUiVisibility(this.f42024e);
        C13510i.C13520j jVar = this.f42023d;
        if (jVar != null) {
            m53673z(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo34241B(C13510i.C13517g gVar) {
        View decorView = this.f42020a.getWindow().getDecorView();
        int i = C10727c.f42029a[gVar.ordinal()];
        if (i == 1) {
            decorView.performHapticFeedback(0);
        } else if (i == 2) {
            decorView.performHapticFeedback(1);
        } else if (i == 3) {
            decorView.performHapticFeedback(3);
        } else if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 21) {
                decorView.performHapticFeedback(4);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    /* renamed from: o */
    public void mo34242o() {
        this.f42021b.mo38639l((C13510i.C13518h) null);
    }
}
