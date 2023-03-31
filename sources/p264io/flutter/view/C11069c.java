package p264io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p264io.flutter.plugin.platform.C10739k;
import p297mb.C11881b;
import p325pc.C12168d;
import p325pc.C12172h;
import p417zb.C13492a;

/* renamed from: io.flutter.view.c */
/* compiled from: AccessibilityBridge */
public class C11069c extends AccessibilityNodeProvider {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final int f42662A = (((((((((((C11078i.HAS_CHECKED_STATE.f42761a | C11078i.IS_CHECKED.f42761a) | C11078i.IS_SELECTED.f42761a) | C11078i.IS_TEXT_FIELD.f42761a) | C11078i.IS_FOCUSED.f42761a) | C11078i.HAS_ENABLED_STATE.f42761a) | C11078i.IS_ENABLED.f42761a) | C11078i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f42761a) | C11078i.HAS_TOGGLED_STATE.f42761a) | C11078i.IS_TOGGLED.f42761a) | C11078i.IS_FOCUSABLE.f42761a) | C11078i.IS_SLIDER.f42761a);

    /* renamed from: B */
    private static int f42663B = 267386881;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final int f42664z = (((C11076g.SCROLL_RIGHT.f42728a | C11076g.SCROLL_LEFT.f42728a) | C11076g.SCROLL_UP.f42728a) | C11076g.SCROLL_DOWN.f42728a);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final View f42665a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13492a f42666b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AccessibilityManager f42667c;

    /* renamed from: d */
    private final AccessibilityViewEmbedder f42668d;

    /* renamed from: e */
    private final C10739k f42669e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ContentResolver f42670f;

    /* renamed from: g */
    private final Map<Integer, C11081l> f42671g;

    /* renamed from: h */
    private final Map<Integer, C11077h> f42672h;

    /* renamed from: i */
    private C11081l f42673i;

    /* renamed from: j */
    private Integer f42674j;

    /* renamed from: k */
    private Integer f42675k;

    /* renamed from: l */
    private int f42676l;

    /* renamed from: m */
    private C11081l f42677m;

    /* renamed from: n */
    private C11081l f42678n;

    /* renamed from: o */
    private C11081l f42679o;

    /* renamed from: p */
    private final List<Integer> f42680p;

    /* renamed from: q */
    private int f42681q;

    /* renamed from: r */
    private Integer f42682r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11080k f42683s;

    /* renamed from: t */
    private boolean f42684t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f42685u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C13492a.C13494b f42686v;

    /* renamed from: w */
    private final AccessibilityManager.AccessibilityStateChangeListener f42687w;

    /* renamed from: x */
    private final AccessibilityManager.TouchExplorationStateChangeListener f42688x;

    /* renamed from: y */
    private final ContentObserver f42689y;

    /* renamed from: io.flutter.view.c$a */
    /* compiled from: AccessibilityBridge */
    class C11070a implements C13492a.C13494b {
        C11070a() {
        }

        /* renamed from: a */
        public void mo34062a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer order : byteBufferArr) {
                order.order(ByteOrder.LITTLE_ENDIAN);
            }
            C11069c.this.mo34846b0(byteBuffer, strArr, byteBufferArr);
        }

        /* renamed from: b */
        public void mo34063b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            C11069c.this.mo34845a0(byteBuffer, strArr);
        }

        /* renamed from: c */
        public void mo34851c(int i) {
            C11069c.this.m54818R(i, 1);
        }

        /* renamed from: d */
        public void mo34852d(String str) {
            C11069c.this.f42665a.announceForAccessibility(str);
        }

        /* renamed from: e */
        public void mo34853e(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityEvent k = C11069c.this.m54812H(0, 32);
                k.getText().add(str);
                C11069c.this.m54819S(k);
            }
        }

        /* renamed from: f */
        public void mo34854f(int i) {
            C11069c.this.m54818R(i, 2);
        }
    }

    /* renamed from: io.flutter.view.c$b */
    /* compiled from: AccessibilityBridge */
    class C11071b implements AccessibilityManager.AccessibilityStateChangeListener {
        C11071b() {
        }

        public void onAccessibilityStateChanged(boolean z) {
            if (!C11069c.this.f42685u) {
                if (z) {
                    C11069c.this.f42666b.mo38626g(C11069c.this.f42686v);
                    C11069c.this.f42666b.mo38624e();
                } else {
                    C11069c.this.m54823W(false);
                    C11069c.this.f42666b.mo38626g((C13492a.C13494b) null);
                    C11069c.this.f42666b.mo38623d();
                }
                if (C11069c.this.f42683s != null) {
                    C11069c.this.f42683s.mo33976a(z, C11069c.this.f42667c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$c */
    /* compiled from: AccessibilityBridge */
    class C11072c extends ContentObserver {
        C11072c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            onChange(z, (Uri) null);
        }

        public void onChange(boolean z, Uri uri) {
            String str;
            if (!C11069c.this.f42685u) {
                if (Build.VERSION.SDK_INT < 17) {
                    str = null;
                } else {
                    str = Settings.Global.getString(C11069c.this.f42670f, "transition_animation_scale");
                }
                if (str != null && str.equals("0")) {
                    C11069c.m54833g(C11069c.this, C11075f.DISABLE_ANIMATIONS.f42704a);
                } else {
                    C11069c.m54832f(C11069c.this, ~C11075f.DISABLE_ANIMATIONS.f42704a);
                }
                C11069c.this.m54820T();
            }
        }
    }

    /* renamed from: io.flutter.view.c$d */
    /* compiled from: AccessibilityBridge */
    class C11073d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilityManager f42693a;

        C11073d(AccessibilityManager accessibilityManager) {
            this.f42693a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z) {
            if (!C11069c.this.f42685u) {
                if (!z) {
                    C11069c.this.m54823W(false);
                    C11069c.this.m54813L();
                }
                if (C11069c.this.f42683s != null) {
                    C11069c.this.f42683s.mo33976a(this.f42693a.isEnabled(), z);
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$e */
    /* compiled from: AccessibilityBridge */
    static /* synthetic */ class C11074e {

        /* renamed from: a */
        static final /* synthetic */ int[] f42695a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.c$o[] r0 = p264io.flutter.view.C11069c.C11084o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42695a = r0
                io.flutter.view.c$o r1 = p264io.flutter.view.C11069c.C11084o.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42695a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.c$o r1 = p264io.flutter.view.C11069c.C11084o.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.view.C11069c.C11074e.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.view.c$f */
    /* compiled from: AccessibilityBridge */
    private enum C11075f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: a */
        final int f42704a;

        private C11075f(int i) {
            this.f42704a = i;
        }
    }

    /* renamed from: io.flutter.view.c$g */
    /* compiled from: AccessibilityBridge */
    public enum C11076g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: a */
        public final int f42728a;

        private C11076g(int i) {
            this.f42728a = i;
        }
    }

    /* renamed from: io.flutter.view.c$h */
    /* compiled from: AccessibilityBridge */
    private static class C11077h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f42729a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f42730b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f42731c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f42732d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f42733e;

        C11077h() {
        }
    }

    /* renamed from: io.flutter.view.c$i */
    /* compiled from: AccessibilityBridge */
    enum C11078i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        

        /* renamed from: a */
        final int f42761a;

        private C11078i(int i) {
            this.f42761a = i;
        }
    }

    /* renamed from: io.flutter.view.c$j */
    /* compiled from: AccessibilityBridge */
    private static class C11079j extends C11083n {

        /* renamed from: d */
        String f42762d;

        private C11079j() {
            super((C11070a) null);
        }

        /* synthetic */ C11079j(C11070a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.c$k */
    /* compiled from: AccessibilityBridge */
    public interface C11080k {
        /* renamed from: a */
        void mo33976a(boolean z, boolean z2);
    }

    /* renamed from: io.flutter.view.c$l */
    /* compiled from: AccessibilityBridge */
    private static class C11081l {

        /* renamed from: A */
        private C11085p f42763A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public boolean f42764B = false;

        /* renamed from: C */
        private int f42765C;

        /* renamed from: D */
        private int f42766D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public int f42767E;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public int f42768F;

        /* renamed from: G */
        private float f42769G;

        /* renamed from: H */
        private float f42770H;

        /* renamed from: I */
        private float f42771I;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public String f42772J;

        /* renamed from: K */
        private String f42773K;

        /* renamed from: L */
        private float f42774L;

        /* renamed from: M */
        private float f42775M;

        /* renamed from: N */
        private float f42776N;

        /* renamed from: O */
        private float f42777O;

        /* renamed from: P */
        private float[] f42778P;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public C11081l f42779Q;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public List<C11081l> f42780R = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: S */
        public List<C11081l> f42781S = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: T */
        public List<C11077h> f42782T;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public C11077h f42783U;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C11077h f42784V;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public boolean f42785W = true;

        /* renamed from: X */
        private float[] f42786X;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public boolean f42787Y = true;

        /* renamed from: Z */
        private float[] f42788Z;

        /* renamed from: a */
        final C11069c f42789a;

        /* renamed from: a0 */
        private Rect f42790a0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f42791b = -1;

        /* renamed from: c */
        private int f42792c;

        /* renamed from: d */
        private int f42793d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f42794e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f42795f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f42796g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f42797h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f42798i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f42799j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f42800k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public float f42801l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public float f42802m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public float f42803n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f42804o;

        /* renamed from: p */
        private List<C11083n> f42805p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f42806q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public List<C11083n> f42807r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public String f42808s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public List<C11083n> f42809t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public String f42810u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public List<C11083n> f42811v;

        /* renamed from: w */
        private String f42812w;

        /* renamed from: x */
        private List<C11083n> f42813x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public String f42814y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public int f42815z = -1;

        C11081l(C11069c cVar) {
            this.f42789a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: A0 */
        public static boolean m54880A0(C11081l lVar, C12168d<C11081l> dVar) {
            return (lVar == null || lVar.m54928j0(dVar) == null) ? false : true;
        }

        /* renamed from: B0 */
        private void m54882B0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        /* renamed from: C0 */
        public void m54884C0(float[] fArr, Set<C11081l> set, boolean z) {
            set.add(this);
            if (this.f42787Y) {
                z = true;
            }
            if (z) {
                if (this.f42788Z == null) {
                    this.f42788Z = new float[16];
                }
                if (this.f42778P == null) {
                    this.f42778P = new float[16];
                }
                Matrix.multiplyMM(this.f42788Z, 0, fArr, 0, this.f42778P, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.f42774L;
                fArr2[1] = this.f42775M;
                m54882B0(fArr3, this.f42788Z, fArr2);
                fArr2[0] = this.f42776N;
                fArr2[1] = this.f42775M;
                m54882B0(fArr4, this.f42788Z, fArr2);
                fArr2[0] = this.f42776N;
                fArr2[1] = this.f42777O;
                m54882B0(fArr5, this.f42788Z, fArr2);
                fArr2[0] = this.f42774L;
                fArr2[1] = this.f42777O;
                m54882B0(fArr6, this.f42788Z, fArr2);
                if (this.f42790a0 == null) {
                    this.f42790a0 = new Rect();
                }
                this.f42790a0.set(Math.round(m54960z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m54960z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(m54958y0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m54958y0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f42787Y = false;
            }
            int i = -1;
            for (C11081l next : this.f42780R) {
                next.f42815z = i;
                i = next.f42791b;
                next.m54884C0(this.f42788Z, set, z);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: D0 */
        public void m54886D0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            this.f42764B = true;
            this.f42772J = this.f42806q;
            this.f42773K = this.f42804o;
            this.f42765C = this.f42792c;
            this.f42766D = this.f42793d;
            this.f42767E = this.f42796g;
            this.f42768F = this.f42797h;
            this.f42769G = this.f42801l;
            this.f42770H = this.f42802m;
            this.f42771I = this.f42803n;
            this.f42792c = byteBuffer.getInt();
            this.f42793d = byteBuffer.getInt();
            this.f42794e = byteBuffer.getInt();
            this.f42795f = byteBuffer.getInt();
            this.f42796g = byteBuffer.getInt();
            this.f42797h = byteBuffer.getInt();
            this.f42798i = byteBuffer.getInt();
            this.f42799j = byteBuffer.getInt();
            this.f42800k = byteBuffer.getInt();
            this.f42801l = byteBuffer.getFloat();
            this.f42802m = byteBuffer.getFloat();
            this.f42803n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            if (i == -1) {
                str = null;
            } else {
                str = strArr[i];
            }
            this.f42804o = str;
            this.f42805p = m54938o0(byteBuffer, byteBufferArr);
            int i2 = byteBuffer.getInt();
            if (i2 == -1) {
                str2 = null;
            } else {
                str2 = strArr[i2];
            }
            this.f42806q = str2;
            this.f42807r = m54938o0(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            if (i3 == -1) {
                str3 = null;
            } else {
                str3 = strArr[i3];
            }
            this.f42808s = str3;
            this.f42809t = m54938o0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            if (i4 == -1) {
                str4 = null;
            } else {
                str4 = strArr[i4];
            }
            this.f42810u = str4;
            this.f42811v = m54938o0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            if (i5 == -1) {
                str5 = null;
            } else {
                str5 = strArr[i5];
            }
            this.f42812w = str5;
            this.f42813x = m54938o0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            if (i6 == -1) {
                str6 = null;
            } else {
                str6 = strArr[i6];
            }
            this.f42814y = str6;
            this.f42763A = C11085p.m54961a(byteBuffer.getInt());
            this.f42774L = byteBuffer.getFloat();
            this.f42775M = byteBuffer.getFloat();
            this.f42776N = byteBuffer.getFloat();
            this.f42777O = byteBuffer.getFloat();
            if (this.f42778P == null) {
                this.f42778P = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                this.f42778P[i7] = byteBuffer.getFloat();
            }
            this.f42785W = true;
            this.f42787Y = true;
            int i8 = byteBuffer.getInt();
            this.f42780R.clear();
            this.f42781S.clear();
            for (int i9 = 0; i9 < i8; i9++) {
                C11081l o = this.f42789a.m54807A(byteBuffer.getInt());
                o.f42779Q = this;
                this.f42780R.add(o);
            }
            for (int i10 = 0; i10 < i8; i10++) {
                C11081l o2 = this.f42789a.m54807A(byteBuffer.getInt());
                o2.f42779Q = this;
                this.f42781S.add(o2);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                this.f42782T = null;
                return;
            }
            List<C11077h> list = this.f42782T;
            if (list == null) {
                this.f42782T = new ArrayList(i11);
            } else {
                list.clear();
            }
            for (int i12 = 0; i12 < i11; i12++) {
                C11077h q = this.f42789a.m54851z(byteBuffer.getInt());
                if (q.f42731c == C11076g.TAP.f42728a) {
                    this.f42783U = q;
                } else if (q.f42731c == C11076g.LONG_PRESS.f42728a) {
                    this.f42784V = q;
                } else {
                    this.f42782T.add(q);
                }
                this.f42782T.add(q);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m54918e0(List<C11081l> list) {
            if (m54952v0(C11078i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (C11081l e0 : this.f42780R) {
                e0.m54918e0(list);
            }
        }

        /* renamed from: f0 */
        private SpannableString m54920f0(String str, List<C11083n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (C11083n next : list) {
                    int i = C11074e.f42695a[next.f42818c.ordinal()];
                    if (i == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.f42816a, next.f42817b, 0);
                    } else if (i == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((C11079j) next).f42762d)), next.f42816a, next.f42817b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public boolean m54922g0() {
            String str;
            String str2 = this.f42804o;
            if (str2 == null && this.f42773K == null) {
                return false;
            }
            if (str2 == null || (str = this.f42773K) == null || !str2.equals(str)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public boolean m54924h0() {
            return !Float.isNaN(this.f42801l) && !Float.isNaN(this.f42769G) && this.f42769G != this.f42801l;
        }

        /* renamed from: i0 */
        private void m54926i0() {
            if (this.f42785W) {
                this.f42785W = false;
                if (this.f42786X == null) {
                    this.f42786X = new float[16];
                }
                if (!Matrix.invertM(this.f42786X, 0, this.f42778P, 0)) {
                    Arrays.fill(this.f42786X, 0.0f);
                }
            }
        }

        /* renamed from: j0 */
        private C11081l m54928j0(C12168d<C11081l> dVar) {
            for (C11081l lVar = this.f42779Q; lVar != null; lVar = lVar.f42779Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public Rect m54930k0() {
            return this.f42790a0;
        }

        /* renamed from: l0 */
        private CharSequence m54932l0() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.f42812w;
            }
            return m54920f0(this.f42812w, this.f42813x);
        }

        /* renamed from: m */
        static /* synthetic */ int m54933m(C11081l lVar, int i) {
            int i2 = lVar.f42797h + i;
            lVar.f42797h = i2;
            return i2;
        }

        /* renamed from: m0 */
        private CharSequence m54934m0() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.f42804o;
            }
            return m54920f0(this.f42804o, this.f42805p);
        }

        /* renamed from: n */
        static /* synthetic */ int m54935n(C11081l lVar, int i) {
            int i2 = lVar.f42797h - i;
            lVar.f42797h = i2;
            return i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: n0 */
        public String m54936n0() {
            String str;
            if (m54952v0(C11078i.NAMES_ROUTE) && (str = this.f42804o) != null && !str.isEmpty()) {
                return this.f42804o;
            }
            for (C11081l n0 : this.f42780R) {
                String n02 = n0.m54936n0();
                if (n02 != null && !n02.isEmpty()) {
                    return n02;
                }
            }
            return null;
        }

        /* renamed from: o0 */
        private List<C11083n> m54938o0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                C11084o oVar = C11084o.values()[byteBuffer.getInt()];
                int i5 = C11074e.f42695a[oVar.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    C11082m mVar = new C11082m((C11070a) null);
                    mVar.f42816a = i3;
                    mVar.f42817b = i4;
                    mVar.f42818c = oVar;
                    arrayList.add(mVar);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    C11079j jVar = new C11079j((C11070a) null);
                    jVar.f42816a = i3;
                    jVar.f42817b = i4;
                    jVar.f42818c = oVar;
                    jVar.f42762d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: p0 */
        public CharSequence m54940p0() {
            CharSequence[] charSequenceArr = {m54934m0(), m54932l0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 2; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        /* renamed from: q0 */
        public CharSequence m54942q0() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.f42806q;
            }
            return m54920f0(this.f42806q, this.f42807r);
        }

        /* access modifiers changed from: private */
        /* renamed from: r0 */
        public CharSequence m54944r0() {
            CharSequence[] charSequenceArr = {m54942q0(), m54934m0(), m54932l0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 3; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        /* renamed from: s0 */
        public boolean m54946s0(C11076g gVar) {
            return (gVar.f42728a & this.f42766D) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: t0 */
        public boolean m54948t0(C11078i iVar) {
            return (iVar.f42761a & this.f42765C) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: u0 */
        public boolean m54950u0(C11076g gVar) {
            return (gVar.f42728a & this.f42793d) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: v0 */
        public boolean m54952v0(C11078i iVar) {
            return (iVar.f42761a & this.f42792c) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: w0 */
        public C11081l m54954w0(float[] fArr, boolean z) {
            float f = fArr[3];
            boolean z2 = false;
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.f42774L || f2 >= this.f42776N || f3 < this.f42775M || f3 >= this.f42777O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (C11081l next : this.f42781S) {
                if (!next.m54952v0(C11078i.IS_HIDDEN)) {
                    next.m54926i0();
                    Matrix.multiplyMV(fArr2, 0, next.f42786X, 0, fArr, 0);
                    C11081l w0 = next.m54954w0(fArr2, z);
                    if (w0 != null) {
                        return w0;
                    }
                }
            }
            if (z && this.f42798i != -1) {
                z2 = true;
            }
            if (m54956x0() || z2) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: x0 */
        public boolean m54956x0() {
            String str;
            String str2;
            String str3;
            if (m54952v0(C11078i.SCOPES_ROUTE)) {
                return false;
            }
            if (!m54952v0(C11078i.IS_FOCUSABLE) && (this.f42793d & (~C11069c.f42664z)) == 0 && (this.f42792c & C11069c.f42662A) == 0 && (((str = this.f42804o) == null || str.isEmpty()) && (((str2 = this.f42806q) == null || str2.isEmpty()) && ((str3 = this.f42812w) == null || str3.isEmpty())))) {
                return false;
            }
            return true;
        }

        /* renamed from: y0 */
        private float m54958y0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        /* renamed from: z0 */
        private float m54960z0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }
    }

    /* renamed from: io.flutter.view.c$m */
    /* compiled from: AccessibilityBridge */
    private static class C11082m extends C11083n {
        private C11082m() {
            super((C11070a) null);
        }

        /* synthetic */ C11082m(C11070a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.c$n */
    /* compiled from: AccessibilityBridge */
    private static class C11083n {

        /* renamed from: a */
        int f42816a;

        /* renamed from: b */
        int f42817b;

        /* renamed from: c */
        C11084o f42818c;

        private C11083n() {
        }

        /* synthetic */ C11083n(C11070a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.c$o */
    /* compiled from: AccessibilityBridge */
    private enum C11084o {
        SPELLOUT,
        LOCALE
    }

    /* renamed from: io.flutter.view.c$p */
    /* compiled from: AccessibilityBridge */
    private enum C11085p {
        UNKNOWN,
        LTR,
        RTL;

        /* renamed from: a */
        public static C11085p m54961a(int i) {
            if (i == 1) {
                return RTL;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return LTR;
        }
    }

    public C11069c(View view, C13492a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, C10739k kVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public C11081l m54807A(int i) {
        C11081l lVar = this.f42671g.get(Integer.valueOf(i));
        if (lVar != null) {
            return lVar;
        }
        C11081l lVar2 = new C11081l(this);
        int unused = lVar2.f42791b = i;
        this.f42671g.put(Integer.valueOf(i), lVar2);
        return lVar2;
    }

    /* renamed from: B */
    private C11081l m54808B() {
        return this.f42671g.get(0);
    }

    /* renamed from: C */
    private void m54809C(float f, float f2, boolean z) {
        C11081l J;
        if (!this.f42671g.isEmpty() && (J = m54808B().m54954w0(new float[]{f, f2, 0.0f, 1.0f}, z)) != this.f42679o) {
            if (J != null) {
                m54818R(J.f42791b, 128);
            }
            C11081l lVar = this.f42679o;
            if (lVar != null) {
                m54818R(lVar.f42791b, 256);
            }
            this.f42679o = J;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ boolean m54810F(C11081l lVar, C11081l lVar2) {
        return lVar2 == lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public AccessibilityEvent m54812H(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.f42665a.getContext().getPackageName());
        obtain.setSource(this.f42665a, i);
        return obtain;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m54813L() {
        C11081l lVar = this.f42679o;
        if (lVar != null) {
            m54818R(lVar.f42791b, 256);
            this.f42679o = null;
        }
    }

    /* renamed from: M */
    private void m54814M(C11081l lVar) {
        String d0 = lVar.m54936n0();
        if (d0 == null) {
            d0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            m54822V(d0);
            return;
        }
        AccessibilityEvent H = m54812H(lVar.f42791b, 32);
        H.getText().add(d0);
        m54819S(H);
    }

    /* renamed from: N */
    private boolean m54815N(C11081l lVar, int i, Bundle bundle, boolean z) {
        int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i3 = lVar.f42796g;
        int k = lVar.f42797h;
        m54817P(lVar, i2, z, z2);
        if (!(i3 == lVar.f42796g && k == lVar.f42797h)) {
            String q = lVar.f42806q != null ? lVar.f42806q : "";
            AccessibilityEvent H = m54812H(lVar.f42791b, 8192);
            H.getText().add(q);
            H.setFromIndex(lVar.f42796g);
            H.setToIndex(lVar.f42797h);
            H.setItemCount(q.length());
            m54819S(H);
        }
        if (i2 == 1) {
            if (z) {
                C11076g gVar = C11076g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.m54950u0(gVar)) {
                    this.f42666b.mo38622c(i, gVar, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            C11076g gVar2 = C11076g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.m54950u0(gVar2)) {
                return false;
            }
            this.f42666b.mo38622c(i, gVar2, Boolean.valueOf(z2));
            return true;
        } else if (i2 == 2) {
            if (z) {
                C11076g gVar3 = C11076g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.m54950u0(gVar3)) {
                    this.f42666b.mo38622c(i, gVar3, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            C11076g gVar4 = C11076g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.m54950u0(gVar4)) {
                return false;
            }
            this.f42666b.mo38622c(i, gVar4, Boolean.valueOf(z2));
            return true;
        } else if (i2 == 4 || i2 == 8 || i2 == 16) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: O */
    private boolean m54816O(C11081l lVar, int i, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f42666b.mo38622c(i, C11076g.SET_TEXT, string);
        String unused = lVar.f42806q = string;
        List unused2 = lVar.f42807r = null;
        return true;
    }

    /* renamed from: P */
    private void m54817P(C11081l lVar, int i, boolean z, boolean z2) {
        if (lVar.f42797h >= 0 && lVar.f42796g >= 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 8 || i == 16) {
                            if (z) {
                                int unused = lVar.f42797h = lVar.f42806q.length();
                            } else {
                                int unused2 = lVar.f42797h = 0;
                            }
                        }
                    } else if (z && lVar.f42797h < lVar.f42806q.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.f42806q.substring(lVar.f42797h));
                        if (matcher.find()) {
                            C11081l.m54933m(lVar, matcher.start(1));
                        } else {
                            int unused3 = lVar.f42797h = lVar.f42806q.length();
                        }
                    } else if (!z && lVar.f42797h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f42806q.substring(0, lVar.f42797h));
                        if (matcher2.find()) {
                            int unused4 = lVar.f42797h = matcher2.start(1);
                        } else {
                            int unused5 = lVar.f42797h = 0;
                        }
                    }
                } else if (z && lVar.f42797h < lVar.f42806q.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f42806q.substring(lVar.f42797h));
                    matcher3.find();
                    if (matcher3.find()) {
                        C11081l.m54933m(lVar, matcher3.start(1));
                    } else {
                        int unused6 = lVar.f42797h = lVar.f42806q.length();
                    }
                } else if (!z && lVar.f42797h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f42806q.substring(0, lVar.f42797h));
                    if (matcher4.find()) {
                        int unused7 = lVar.f42797h = matcher4.start(1);
                    }
                }
            } else if (z && lVar.f42797h < lVar.f42806q.length()) {
                C11081l.m54933m(lVar, 1);
            } else if (!z && lVar.f42797h > 0) {
                C11081l.m54935n(lVar, 1);
            }
            if (!z2) {
                int unused8 = lVar.f42796g = lVar.f42797h;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m54818R(int i, int i2) {
        if (this.f42667c.isEnabled()) {
            m54819S(m54812H(i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m54819S(AccessibilityEvent accessibilityEvent) {
        if (this.f42667c.isEnabled()) {
            this.f42665a.getParent().requestSendAccessibilityEvent(this.f42665a, accessibilityEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m54820T() {
        this.f42666b.mo38625f(this.f42676l);
    }

    /* renamed from: U */
    private void m54821U(int i) {
        AccessibilityEvent H = m54812H(i, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            H.setContentChangeTypes(1);
        }
        m54819S(H);
    }

    /* renamed from: V */
    private void m54822V(String str) {
        this.f42665a.setAccessibilityPaneTitle(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m54823W(boolean z) {
        if (this.f42684t != z) {
            this.f42684t = z;
            if (z) {
                this.f42676l |= C11075f.ACCESSIBLE_NAVIGATION.f42704a;
            } else {
                this.f42676l &= ~C11075f.ACCESSIBLE_NAVIGATION.f42704a;
            }
            m54820T();
        }
    }

    /* renamed from: X */
    private void m54824X() {
        View view = this.f42665a;
        if (view != null && view.getResources() != null) {
            int i = this.f42665a.getResources().getConfiguration().fontWeightAdjustment;
            if (i != Integer.MAX_VALUE && i >= 300) {
                this.f42676l |= C11075f.BOLD_TEXT.f42704a;
            } else {
                this.f42676l &= C11075f.BOLD_TEXT.f42704a;
            }
            m54820T();
        }
    }

    /* renamed from: Z */
    private boolean m54825Z(C11081l lVar) {
        return lVar.f42799j > 0 && (C11081l.m54880A0(this.f42673i, new C11067a(lVar)) || !C11081l.m54880A0(this.f42673i, C11068b.f42661a));
    }

    /* renamed from: c0 */
    private void m54829c0(C11081l lVar) {
        View b;
        Integer num;
        C11081l unused = lVar.f42779Q = null;
        if (!(lVar.f42798i == -1 || (num = this.f42674j) == null || this.f42668d.platformViewOfNode(num.intValue()) != this.f42669e.mo34281b(lVar.f42798i))) {
            m54818R(this.f42674j.intValue(), 65536);
            this.f42674j = null;
        }
        if (!(lVar.f42798i == -1 || (b = this.f42669e.mo34281b(lVar.f42798i)) == null)) {
            b.setImportantForAccessibility(4);
        }
        C11081l lVar2 = this.f42673i;
        if (lVar2 == lVar) {
            m54818R(lVar2.f42791b, 65536);
            this.f42673i = null;
        }
        if (this.f42677m == lVar) {
            this.f42677m = null;
        }
        if (this.f42679o == lVar) {
            this.f42679o = null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ int m54832f(C11069c cVar, int i) {
        int i2 = i & cVar.f42676l;
        cVar.f42676l = i2;
        return i2;
    }

    /* renamed from: g */
    static /* synthetic */ int m54833g(C11069c cVar, int i) {
        int i2 = i | cVar.f42676l;
        cVar.f42676l = i2;
        return i2;
    }

    /* renamed from: v */
    private AccessibilityEvent m54848v(int i, String str, String str2) {
        AccessibilityEvent H = m54812H(i, 16);
        H.setBeforeText(str);
        H.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 >= str.length() && i2 >= str2.length()) {
            return null;
        }
        H.setFromIndex(i2);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        H.setRemovedCount((length - i2) + 1);
        H.setAddedCount((length2 - i2) + 1);
        return H;
    }

    /* renamed from: w */
    private boolean m54849w() {
        Activity e = C12172h.m58454e(this.f42665a.getContext());
        if (e == null || e.getWindow() == null) {
            return false;
        }
        int i = e.getWindow().getAttributes().layoutInDisplayCutoutMode;
        if (i == 2 || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private Rect m54850y(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f42665a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public C11077h m54851z(int i) {
        C11077h hVar = this.f42672h.get(Integer.valueOf(i));
        if (hVar != null) {
            return hVar;
        }
        C11077h hVar2 = new C11077h();
        int unused = hVar2.f42730b = i;
        int unused2 = hVar2.f42729a = f42663B + i;
        this.f42672h.put(Integer.valueOf(i), hVar2);
        return hVar2;
    }

    /* renamed from: D */
    public boolean mo34838D() {
        return this.f42667c.isEnabled();
    }

    /* renamed from: E */
    public boolean mo34839E() {
        return this.f42667c.isTouchExplorationEnabled();
    }

    /* renamed from: I */
    public AccessibilityNodeInfo mo34840I(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    /* renamed from: J */
    public boolean mo34841J(MotionEvent motionEvent) {
        return mo34842K(motionEvent, false);
    }

    /* renamed from: K */
    public boolean mo34842K(MotionEvent motionEvent, boolean z) {
        if (!this.f42667c.isTouchExplorationEnabled() || this.f42671g.isEmpty()) {
            return false;
        }
        C11081l J = m54808B().m54954w0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
        if (J == null || J.f42798i == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                m54809C(motionEvent.getX(), motionEvent.getY(), z);
            } else if (motionEvent.getAction() == 10) {
                m54813L();
            } else {
                C11881b.m57383a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            return this.f42668d.onAccessibilityHoverEvent(J.f42791b, motionEvent);
        }
    }

    /* renamed from: Q */
    public void mo34843Q() {
        this.f42685u = true;
        this.f42669e.mo34283d();
        mo34844Y((C11080k) null);
        this.f42667c.removeAccessibilityStateChangeListener(this.f42687w);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f42667c.removeTouchExplorationStateChangeListener(this.f42688x);
        }
        this.f42670f.unregisterContentObserver(this.f42689y);
        this.f42666b.mo38626g((C13492a.C13494b) null);
    }

    /* renamed from: Y */
    public void mo34844Y(C11080k kVar) {
        this.f42683s = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo34845a0(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        while (byteBuffer.hasRemaining()) {
            C11077h z = m54851z(byteBuffer.getInt());
            int unused = z.f42731c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str2 = null;
            if (i == -1) {
                str = null;
            } else {
                str = strArr[i];
            }
            String unused2 = z.f42732d = str;
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str2 = strArr[i2];
            }
            String unused3 = z.f42733e = str2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.c$l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34846b0(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.c$l r1 = r8.m54807A(r1)
            r1.m54886D0(r9, r10, r11)
            io.flutter.view.c$i r3 = p264io.flutter.view.C11069c.C11078i.IS_HIDDEN
            boolean r3 = r1.m54952v0(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.c$i r3 = p264io.flutter.view.C11069c.C11078i.IS_FOCUSED
            boolean r3 = r1.m54952v0(r3)
            if (r3 == 0) goto L_0x002a
            r8.f42677m = r1
        L_0x002a:
            boolean r3 = r1.f42764B
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.f42798i
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f42669e
            int r4 = r1.f42798i
            boolean r3 = r3.mo34282c(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f42669e
            int r1 = r1.f42798i
            android.view.View r1 = r3.mo34281b(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.c$l r10 = r8.m54808B()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00b7
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00b1
            r5 = 28
            if (r4 < r5) goto L_0x007d
            boolean r4 = r8.m54849w()
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r8.f42665a
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00b1
            java.lang.Integer r5 = r8.f42682r
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009e
            boolean unused = r10.f42787Y = r1
            boolean unused = r10.f42785W = r1
        L_0x009e:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.f42682r = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00b1:
            r10.m54884C0(r3, r9, r2)
            r10.m54918e0(r11)
        L_0x00b7:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r10.next()
            io.flutter.view.c$l r5 = (p264io.flutter.view.C11069c.C11081l) r5
            java.util.List<java.lang.Integer> r6 = r8.f42680p
            int r7 = r5.f42791b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00bd
            r4 = r5
            goto L_0x00bd
        L_0x00db:
            if (r4 != 0) goto L_0x00ef
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00ef
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.c$l r4 = (p264io.flutter.view.C11069c.C11081l) r4
        L_0x00ef:
            if (r4 == 0) goto L_0x010e
            int r10 = r4.f42791b
            int r5 = r8.f42681q
            if (r10 != r5) goto L_0x0105
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.f42680p
            int r5 = r5.size()
            if (r10 == r5) goto L_0x010e
        L_0x0105:
            int r10 = r4.f42791b
            r8.f42681q = r10
            r8.m54814M(r4)
        L_0x010e:
            java.util.List<java.lang.Integer> r10 = r8.f42680p
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x0117:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            io.flutter.view.c$l r11 = (p264io.flutter.view.C11069c.C11081l) r11
            java.util.List<java.lang.Integer> r4 = r8.f42680p
            int r11 = r11.f42791b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x0117
        L_0x0131:
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r10 = r8.f42671g
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.c$l r11 = (p264io.flutter.view.C11069c.C11081l) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x013b
            r8.m54829c0(r11)
            r10.remove()
            goto L_0x013b
        L_0x015a:
            r8.m54821U(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0340
            java.lang.Object r10 = r9.next()
            io.flutter.view.c$l r10 = (p264io.flutter.view.C11069c.C11081l) r10
            boolean r11 = r10.m54924h0()
            if (r11 == 0) goto L_0x0232
            int r11 = r10.f42791b
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.m54812H(r11, r0)
            float r0 = r10.f42801l
            float r4 = r10.f42802m
            float r5 = r10.f42802m
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x019f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x019c
            r0 = 1200142336(0x4788b800, float:70000.0)
        L_0x019c:
            r4 = 1203982336(0x47c35000, float:100000.0)
        L_0x019f:
            float r5 = r10.f42803n
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01b6
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b4
            r0 = -947341312(0xffffffffc788b800, float:-70000.0)
        L_0x01b4:
            float r0 = r0 + r7
            goto L_0x01c0
        L_0x01b6:
            float r5 = r10.f42803n
            float r4 = r4 - r5
            float r5 = r10.f42803n
            float r0 = r0 - r5
        L_0x01c0:
            io.flutter.view.c$g r5 = p264io.flutter.view.C11069c.C11076g.SCROLL_UP
            boolean r5 = r10.m54946s0(r5)
            if (r5 != 0) goto L_0x01ea
            io.flutter.view.c$g r5 = p264io.flutter.view.C11069c.C11076g.SCROLL_DOWN
            boolean r5 = r10.m54946s0(r5)
            if (r5 == 0) goto L_0x01d1
            goto L_0x01ea
        L_0x01d1:
            io.flutter.view.c$g r5 = p264io.flutter.view.C11069c.C11076g.SCROLL_LEFT
            boolean r5 = r10.m54946s0(r5)
            if (r5 != 0) goto L_0x01e1
            io.flutter.view.c$g r5 = p264io.flutter.view.C11069c.C11076g.SCROLL_RIGHT
            boolean r5 = r10.m54946s0(r5)
            if (r5 == 0) goto L_0x01f2
        L_0x01e1:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01f2
        L_0x01ea:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01f2:
            int r0 = r10.f42799j
            if (r0 <= 0) goto L_0x022f
            int r0 = r10.f42799j
            r11.setItemCount(r0)
            int r0 = r10.f42800k
            r11.setFromIndex(r0)
            java.util.List r0 = r10.f42781S
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x020f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0226
            java.lang.Object r5 = r0.next()
            io.flutter.view.c$l r5 = (p264io.flutter.view.C11069c.C11081l) r5
            io.flutter.view.c$i r6 = p264io.flutter.view.C11069c.C11078i.IS_HIDDEN
            boolean r5 = r5.m54952v0(r6)
            if (r5 != 0) goto L_0x020f
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0226:
            int r0 = r10.f42800k
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x022f:
            r8.m54819S(r11)
        L_0x0232:
            io.flutter.view.c$i r11 = p264io.flutter.view.C11069c.C11078i.IS_LIVE_REGION
            boolean r11 = r10.m54952v0(r11)
            if (r11 == 0) goto L_0x0247
            boolean r11 = r10.m54922g0()
            if (r11 == 0) goto L_0x0247
            int r11 = r10.f42791b
            r8.m54821U(r11)
        L_0x0247:
            io.flutter.view.c$l r11 = r8.f42673i
            if (r11 == 0) goto L_0x027a
            int r11 = r11.f42791b
            int r0 = r10.f42791b
            if (r11 != r0) goto L_0x027a
            io.flutter.view.c$i r11 = p264io.flutter.view.C11069c.C11078i.IS_SELECTED
            boolean r0 = r10.m54948t0(r11)
            if (r0 != 0) goto L_0x027a
            boolean r11 = r10.m54952v0(r11)
            if (r11 == 0) goto L_0x027a
            int r11 = r10.f42791b
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.m54812H(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.f42804o
            r0.add(r4)
            r8.m54819S(r11)
        L_0x027a:
            io.flutter.view.c$l r11 = r8.f42677m
            if (r11 == 0) goto L_0x02aa
            int r11 = r11.f42791b
            int r0 = r10.f42791b
            if (r11 != r0) goto L_0x02aa
            io.flutter.view.c$l r11 = r8.f42678n
            if (r11 == 0) goto L_0x0298
            int r11 = r11.f42791b
            io.flutter.view.c$l r0 = r8.f42677m
            int r0 = r0.f42791b
            if (r11 == r0) goto L_0x02aa
        L_0x0298:
            io.flutter.view.c$l r11 = r8.f42677m
            r8.f42678n = r11
            int r11 = r10.f42791b
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.m54812H(r11, r0)
            r8.m54819S(r11)
            goto L_0x02b0
        L_0x02aa:
            io.flutter.view.c$l r11 = r8.f42677m
            if (r11 != 0) goto L_0x02b0
            r8.f42678n = r3
        L_0x02b0:
            io.flutter.view.c$l r11 = r8.f42677m
            if (r11 == 0) goto L_0x0161
            int r11 = r11.f42791b
            int r0 = r10.f42791b
            if (r11 != r0) goto L_0x0161
            io.flutter.view.c$i r11 = p264io.flutter.view.C11069c.C11078i.IS_TEXT_FIELD
            boolean r0 = r10.m54948t0(r11)
            if (r0 == 0) goto L_0x0161
            boolean r11 = r10.m54952v0(r11)
            if (r11 == 0) goto L_0x0161
            io.flutter.view.c$l r11 = r8.f42673i
            if (r11 == 0) goto L_0x02dc
            int r11 = r11.f42791b
            io.flutter.view.c$l r0 = r8.f42677m
            int r0 = r0.f42791b
            if (r11 != r0) goto L_0x0161
        L_0x02dc:
            java.lang.String r11 = r10.f42772J
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02e9
            java.lang.String r11 = r10.f42772J
            goto L_0x02ea
        L_0x02e9:
            r11 = r0
        L_0x02ea:
            java.lang.String r4 = r10.f42806q
            if (r4 == 0) goto L_0x02f4
            java.lang.String r0 = r10.f42806q
        L_0x02f4:
            int r4 = r10.f42791b
            android.view.accessibility.AccessibilityEvent r11 = r8.m54848v(r4, r11, r0)
            if (r11 == 0) goto L_0x0301
            r8.m54819S(r11)
        L_0x0301:
            int r11 = r10.f42767E
            int r4 = r10.f42796g
            if (r11 != r4) goto L_0x0315
            int r11 = r10.f42768F
            int r4 = r10.f42797h
            if (r11 == r4) goto L_0x0161
        L_0x0315:
            int r11 = r10.f42791b
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.m54812H(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.f42796g
            r11.setFromIndex(r4)
            int r10 = r10.f42797h
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.m54819S(r11)
            goto L_0x0161
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.view.C11069c.mo34846b0(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        int i2;
        C11081l lVar;
        int i3 = i;
        boolean z = true;
        m54823W(true);
        if (i3 >= 65536) {
            return this.f42668d.createAccessibilityNodeInfo(i3);
        }
        if (i3 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f42665a);
            this.f42665a.onInitializeAccessibilityNodeInfo(obtain);
            if (this.f42671g.containsKey(0)) {
                obtain.addChild(this.f42665a, 0);
            }
            return obtain;
        }
        C11081l lVar2 = this.f42671g.get(Integer.valueOf(i));
        if (lVar2 == null) {
            return null;
        }
        if (lVar2.f42798i == -1 || !this.f42669e.mo34282c(lVar2.f42798i)) {
            AccessibilityNodeInfo I = mo34840I(this.f42665a, i3);
            int i4 = Build.VERSION.SDK_INT;
            String str = "";
            if (i4 >= 18) {
                I.setViewIdResourceName(str);
            }
            I.setPackageName(this.f42665a.getContext().getPackageName());
            I.setClassName("android.view.View");
            I.setSource(this.f42665a, i3);
            I.setFocusable(lVar2.m54956x0());
            C11081l lVar3 = this.f42677m;
            if (lVar3 != null) {
                I.setFocused(lVar3.f42791b == i3);
            }
            C11081l lVar4 = this.f42673i;
            if (lVar4 != null) {
                I.setAccessibilityFocused(lVar4.f42791b == i3);
            }
            C11078i iVar = C11078i.IS_TEXT_FIELD;
            if (lVar2.m54952v0(iVar)) {
                I.setPassword(lVar2.m54952v0(C11078i.IS_OBSCURED));
                C11078i iVar2 = C11078i.IS_READ_ONLY;
                if (!lVar2.m54952v0(iVar2)) {
                    I.setClassName("android.widget.EditText");
                }
                if (i4 >= 18) {
                    I.setEditable(!lVar2.m54952v0(iVar2));
                    if (!(lVar2.f42796g == -1 || lVar2.f42797h == -1)) {
                        I.setTextSelection(lVar2.f42796g, lVar2.f42797h);
                    }
                    if (i4 > 18 && (lVar = this.f42673i) != null && lVar.f42791b == i3) {
                        I.setLiveRegion(1);
                    }
                }
                if (lVar2.m54950u0(C11076g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    I.addAction(256);
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (lVar2.m54950u0(C11076g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    I.addAction(512);
                    i2 |= 1;
                }
                if (lVar2.m54950u0(C11076g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    I.addAction(256);
                    i2 |= 2;
                }
                if (lVar2.m54950u0(C11076g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    I.addAction(512);
                    i2 |= 2;
                }
                I.setMovementGranularities(i2);
                if (i4 >= 21 && lVar2.f42794e >= 0) {
                    int length = lVar2.f42806q == null ? 0 : lVar2.f42806q.length();
                    int unused = lVar2.f42795f;
                    int unused2 = lVar2.f42794e;
                    I.setMaxTextLength((length - lVar2.f42795f) + lVar2.f42794e);
                }
            }
            if (i4 > 18) {
                if (lVar2.m54950u0(C11076g.SET_SELECTION)) {
                    I.addAction(131072);
                }
                if (lVar2.m54950u0(C11076g.COPY)) {
                    I.addAction(16384);
                }
                if (lVar2.m54950u0(C11076g.CUT)) {
                    I.addAction(65536);
                }
                if (lVar2.m54950u0(C11076g.PASTE)) {
                    I.addAction(32768);
                }
            }
            if (i4 >= 21 && lVar2.m54950u0(C11076g.SET_TEXT)) {
                I.addAction(2097152);
            }
            if (lVar2.m54952v0(C11078i.IS_BUTTON) || lVar2.m54952v0(C11078i.IS_LINK)) {
                I.setClassName("android.widget.Button");
            }
            if (lVar2.m54952v0(C11078i.IS_IMAGE)) {
                I.setClassName("android.widget.ImageView");
            }
            if (i4 > 18 && lVar2.m54950u0(C11076g.DISMISS)) {
                I.setDismissable(true);
                I.addAction(1048576);
            }
            if (lVar2.f42779Q != null) {
                I.setParent(this.f42665a, lVar2.f42779Q.f42791b);
            } else {
                I.setParent(this.f42665a);
            }
            if (lVar2.f42815z != -1 && i4 >= 22) {
                I.setTraversalAfter(this.f42665a, lVar2.f42815z);
            }
            Rect f = lVar2.m54930k0();
            if (lVar2.f42779Q != null) {
                Rect f2 = lVar2.f42779Q.m54930k0();
                Rect rect = new Rect(f);
                rect.offset(-f2.left, -f2.top);
                I.setBoundsInParent(rect);
            } else {
                I.setBoundsInParent(f);
            }
            I.setBoundsInScreen(m54850y(f));
            I.setVisibleToUser(true);
            I.setEnabled(!lVar2.m54952v0(C11078i.HAS_ENABLED_STATE) || lVar2.m54952v0(C11078i.IS_ENABLED));
            if (lVar2.m54950u0(C11076g.TAP)) {
                if (i4 < 21 || lVar2.f42783U == null) {
                    I.addAction(16);
                    I.setClickable(true);
                } else {
                    I.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar2.f42783U.f42733e));
                    I.setClickable(true);
                }
            }
            if (lVar2.m54950u0(C11076g.LONG_PRESS)) {
                if (i4 < 21 || lVar2.f42784V == null) {
                    I.addAction(32);
                    I.setLongClickable(true);
                } else {
                    I.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar2.f42784V.f42733e));
                    I.setLongClickable(true);
                }
            }
            C11076g gVar = C11076g.SCROLL_LEFT;
            if (lVar2.m54950u0(gVar) || lVar2.m54950u0(C11076g.SCROLL_UP) || lVar2.m54950u0(C11076g.SCROLL_RIGHT) || lVar2.m54950u0(C11076g.SCROLL_DOWN)) {
                I.setScrollable(true);
                if (lVar2.m54952v0(C11078i.HAS_IMPLICIT_SCROLLING)) {
                    if (lVar2.m54950u0(gVar) || lVar2.m54950u0(C11076g.SCROLL_RIGHT)) {
                        if (i4 <= 19 || !m54825Z(lVar2)) {
                            I.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            I.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar2.f42799j, false));
                        }
                        if (lVar2.m54950u0(gVar) || lVar2.m54950u0(C11076g.SCROLL_UP)) {
                            I.addAction(4096);
                        }
                        if (lVar2.m54950u0(C11076g.SCROLL_RIGHT) || lVar2.m54950u0(C11076g.SCROLL_DOWN)) {
                            I.addAction(8192);
                        }
                    } else if (i4 <= 18 || !m54825Z(lVar2)) {
                        I.setClassName("android.widget.ScrollView");
                    } else {
                        I.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar2.f42799j, 0, false));
                    }
                }
                I.addAction(4096);
                I.addAction(8192);
            }
            C11076g gVar2 = C11076g.INCREASE;
            if (lVar2.m54950u0(gVar2) || lVar2.m54950u0(C11076g.DECREASE)) {
                I.setClassName("android.widget.SeekBar");
                if (lVar2.m54950u0(gVar2)) {
                    I.addAction(4096);
                }
                if (lVar2.m54950u0(C11076g.DECREASE)) {
                    I.addAction(8192);
                }
            }
            if (lVar2.m54952v0(C11078i.IS_LIVE_REGION) && i4 > 18) {
                I.setLiveRegion(1);
            }
            if (lVar2.m54952v0(iVar)) {
                I.setText(lVar2.m54942q0());
                if (i4 >= 28) {
                    I.setHintText(lVar2.m54940p0());
                }
            } else if (!lVar2.m54952v0(C11078i.SCOPES_ROUTE)) {
                CharSequence A = lVar2.m54944r0();
                String str2 = A;
                if (i4 < 28) {
                    str2 = A;
                    if (lVar2.f42814y != null) {
                        if (A != null) {
                            str = A;
                        }
                        str2 = str + "\n" + lVar2.f42814y;
                    }
                }
                if (str2 != null) {
                    I.setContentDescription(str2);
                }
            }
            if (i4 >= 28 && lVar2.f42814y != null) {
                I.setTooltipText(lVar2.f42814y);
            }
            boolean h = lVar2.m54952v0(C11078i.HAS_CHECKED_STATE);
            boolean h2 = lVar2.m54952v0(C11078i.HAS_TOGGLED_STATE);
            if (!h && !h2) {
                z = false;
            }
            I.setCheckable(z);
            if (h) {
                I.setChecked(lVar2.m54952v0(C11078i.IS_CHECKED));
                if (lVar2.m54952v0(C11078i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                    I.setClassName("android.widget.RadioButton");
                } else {
                    I.setClassName("android.widget.CheckBox");
                }
            } else if (h2) {
                I.setChecked(lVar2.m54952v0(C11078i.IS_TOGGLED));
                I.setClassName("android.widget.Switch");
            }
            I.setSelected(lVar2.m54952v0(C11078i.IS_SELECTED));
            if (i4 >= 28) {
                I.setHeading(lVar2.m54952v0(C11078i.IS_HEADER));
            }
            C11081l lVar5 = this.f42673i;
            if (lVar5 == null || lVar5.f42791b != i3) {
                I.addAction(64);
            } else {
                I.addAction(128);
            }
            if (i4 >= 21 && lVar2.f42782T != null) {
                for (C11077h hVar : lVar2.f42782T) {
                    I.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f42729a, hVar.f42732d));
                }
            }
            for (C11081l lVar6 : lVar2.f42780R) {
                if (!lVar6.m54952v0(C11078i.IS_HIDDEN)) {
                    if (lVar6.f42798i != -1) {
                        View b = this.f42669e.mo34281b(lVar6.f42798i);
                        if (!this.f42669e.mo34282c(lVar6.f42798i)) {
                            I.addChild(b);
                        }
                    }
                    I.addChild(this.f42665a, lVar6.f42791b);
                }
            }
            return I;
        }
        View b2 = this.f42669e.mo34281b(lVar2.f42798i);
        if (b2 == null) {
            return null;
        }
        return this.f42668d.getRootNode(b2, lVar2.f42791b, lVar2.m54930k0());
    }

    public AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            C11081l lVar = this.f42677m;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f42791b);
            }
            Integer num = this.f42675k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        C11081l lVar2 = this.f42673i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f42791b);
        }
        Integer num2 = this.f42674j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i >= 65536) {
            boolean performAction = this.f42668d.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.f42674j = null;
            }
            return performAction;
        }
        C11081l lVar = this.f42671g.get(Integer.valueOf(i));
        boolean z = false;
        if (lVar == null) {
            return false;
        }
        switch (i2) {
            case 16:
                this.f42666b.mo38621b(i, C11076g.TAP);
                return true;
            case 32:
                this.f42666b.mo38621b(i, C11076g.LONG_PRESS);
                return true;
            case C8710R.styleable.AppCompatTheme_dividerHorizontal:
                if (this.f42673i == null) {
                    this.f42665a.invalidate();
                }
                this.f42673i = lVar;
                this.f42666b.mo38621b(i, C11076g.DID_GAIN_ACCESSIBILITY_FOCUS);
                m54818R(i, 32768);
                if (lVar.m54950u0(C11076g.INCREASE) || lVar.m54950u0(C11076g.DECREASE)) {
                    m54818R(i, 4);
                }
                return true;
            case 128:
                C11081l lVar2 = this.f42673i;
                if (lVar2 != null && lVar2.f42791b == i) {
                    this.f42673i = null;
                }
                Integer num = this.f42674j;
                if (num != null && num.intValue() == i) {
                    this.f42674j = null;
                }
                this.f42666b.mo38621b(i, C11076g.DID_LOSE_ACCESSIBILITY_FOCUS);
                m54818R(i, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return m54815N(lVar, i, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return m54815N(lVar, i, bundle, false);
            case 4096:
                C11076g gVar = C11076g.SCROLL_UP;
                if (lVar.m54950u0(gVar)) {
                    this.f42666b.mo38621b(i, gVar);
                } else {
                    C11076g gVar2 = C11076g.SCROLL_LEFT;
                    if (lVar.m54950u0(gVar2)) {
                        this.f42666b.mo38621b(i, gVar2);
                    } else {
                        C11076g gVar3 = C11076g.INCREASE;
                        if (!lVar.m54950u0(gVar3)) {
                            return false;
                        }
                        String unused = lVar.f42806q = lVar.f42808s;
                        List unused2 = lVar.f42807r = lVar.f42809t;
                        m54818R(i, 4);
                        this.f42666b.mo38621b(i, gVar3);
                    }
                }
                return true;
            case 8192:
                C11076g gVar4 = C11076g.SCROLL_DOWN;
                if (lVar.m54950u0(gVar4)) {
                    this.f42666b.mo38621b(i, gVar4);
                } else {
                    C11076g gVar5 = C11076g.SCROLL_RIGHT;
                    if (lVar.m54950u0(gVar5)) {
                        this.f42666b.mo38621b(i, gVar5);
                    } else {
                        C11076g gVar6 = C11076g.DECREASE;
                        if (!lVar.m54950u0(gVar6)) {
                            return false;
                        }
                        String unused3 = lVar.f42806q = lVar.f42810u;
                        List unused4 = lVar.f42807r = lVar.f42811v;
                        m54818R(i, 4);
                        this.f42666b.mo38621b(i, gVar6);
                    }
                }
                return true;
            case 16384:
                this.f42666b.mo38621b(i, C11076g.COPY);
                return true;
            case 32768:
                this.f42666b.mo38621b(i, C11076g.PASTE);
                return true;
            case 65536:
                this.f42666b.mo38621b(i, C11076g.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z = true;
                }
                if (z) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f42797h));
                    hashMap.put("extent", Integer.valueOf(lVar.f42797h));
                }
                this.f42666b.mo38622c(i, C11076g.SET_SELECTION, hashMap);
                C11081l lVar3 = this.f42671g.get(Integer.valueOf(i));
                int unused5 = lVar3.f42796g = ((Integer) hashMap.get("base")).intValue();
                int unused6 = lVar3.f42797h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f42666b.mo38621b(i, C11076g.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return m54816O(lVar, i, bundle);
            case 16908342:
                this.f42666b.mo38621b(i, C11076g.SHOW_ON_SCREEN);
                return true;
            default:
                C11077h hVar = this.f42672h.get(Integer.valueOf(i2 - f42663B));
                if (hVar == null) {
                    return false;
                }
                this.f42666b.mo38622c(i, C11076g.CUSTOM_ACTION, Integer.valueOf(hVar.f42730b));
                return true;
        }
    }

    /* renamed from: x */
    public boolean mo34850x(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f42668d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f42668d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f42675k = recordFlutterId;
            this.f42677m = null;
            return true;
        } else if (eventType == 128) {
            this.f42679o = null;
            return true;
        } else if (eventType == 32768) {
            this.f42674j = recordFlutterId;
            this.f42673i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f42675k = null;
            this.f42674j = null;
            return true;
        }
    }

    public C11069c(View view, C13492a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, C10739k kVar) {
        this.f42671g = new HashMap();
        this.f42672h = new HashMap();
        this.f42676l = 0;
        this.f42680p = new ArrayList();
        this.f42681q = 0;
        this.f42682r = 0;
        this.f42684t = false;
        this.f42685u = false;
        this.f42686v = new C11070a();
        C11071b bVar = new C11071b();
        this.f42687w = bVar;
        C11072c cVar = new C11072c(new Handler());
        this.f42689y = cVar;
        this.f42665a = view;
        this.f42666b = aVar;
        this.f42667c = accessibilityManager;
        this.f42670f = contentResolver;
        this.f42668d = accessibilityViewEmbedder;
        this.f42669e = kVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            C11073d dVar = new C11073d(accessibilityManager);
            this.f42688x = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.f42688x = null;
        }
        if (i >= 17) {
            cVar.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        }
        if (i >= 31) {
            m54824X();
        }
        kVar.mo34280a(this);
    }
}
