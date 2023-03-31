package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.util.C0831h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p124r.C5415b;

/* renamed from: androidx.emoji2.text.e */
/* compiled from: EmojiCompat */
public class C1014e {

    /* renamed from: n */
    private static final Object f2717n = new Object();

    /* renamed from: o */
    private static final Object f2718o = new Object();

    /* renamed from: p */
    private static volatile C1014e f2719p;

    /* renamed from: a */
    private final ReadWriteLock f2720a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set<C1020e> f2721b;

    /* renamed from: c */
    private volatile int f2722c = 3;

    /* renamed from: d */
    private final Handler f2723d;

    /* renamed from: e */
    private final C1017b f2724e;

    /* renamed from: f */
    final C1022g f2725f;

    /* renamed from: g */
    final boolean f2726g;

    /* renamed from: h */
    final boolean f2727h;

    /* renamed from: i */
    final int[] f2728i;

    /* renamed from: j */
    private final boolean f2729j;

    /* renamed from: k */
    private final int f2730k;

    /* renamed from: l */
    private final int f2731l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1019d f2732m;

    /* renamed from: androidx.emoji2.text.e$a */
    /* compiled from: EmojiCompat */
    private static final class C1015a extends C1017b {

        /* renamed from: b */
        private volatile C1027h f2733b;

        /* renamed from: c */
        private volatile C1039m f2734c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        /* compiled from: EmojiCompat */
        class C1016a extends C1023h {
            C1016a() {
            }

            /* renamed from: a */
            public void mo3617a(Throwable th) {
                C1015a.this.f2736a.mo3631m(th);
            }

            /* renamed from: b */
            public void mo3618b(C1039m mVar) {
                C1015a.this.mo3643d(mVar);
            }
        }

        C1015a(C1014e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3640a() {
            try {
                this.f2736a.f2725f.mo3615a(new C1016a());
            } catch (Throwable th) {
                this.f2736a.mo3631m(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3641b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f2733b.mo3662h(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3642c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2734c.mo3686e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2736a.f2726g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3643d(C1039m mVar) {
            if (mVar == null) {
                this.f2736a.mo3631m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2734c = mVar;
            C1039m mVar2 = this.f2734c;
            C1024i iVar = new C1024i();
            C1019d a = this.f2736a.f2732m;
            C1014e eVar = this.f2736a;
            this.f2733b = new C1027h(mVar2, iVar, a, eVar.f2727h, eVar.f2728i);
            this.f2736a.mo3632n();
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    /* compiled from: EmojiCompat */
    private static class C1017b {

        /* renamed from: a */
        final C1014e f2736a;

        C1017b(C1014e eVar) {
            this.f2736a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3640a() {
            this.f2736a.mo3632n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3641b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3642c(EditorInfo editorInfo) {
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    /* compiled from: EmojiCompat */
    public static abstract class C1018c {

        /* renamed from: a */
        final C1022g f2737a;

        /* renamed from: b */
        boolean f2738b;

        /* renamed from: c */
        boolean f2739c;

        /* renamed from: d */
        int[] f2740d;

        /* renamed from: e */
        Set<C1020e> f2741e;

        /* renamed from: f */
        boolean f2742f;

        /* renamed from: g */
        int f2743g = -16711936;

        /* renamed from: h */
        int f2744h = 0;

        /* renamed from: i */
        C1019d f2745i = new C1013d();

        protected C1018c(C1022g gVar) {
            C0831h.m3663g(gVar, "metadataLoader cannot be null.");
            this.f2737a = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C1022g mo3644a() {
            return this.f2737a;
        }

        /* renamed from: b */
        public C1018c mo3645b(int i) {
            this.f2744h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    /* compiled from: EmojiCompat */
    public interface C1019d {
        /* renamed from: a */
        boolean mo3626a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    /* compiled from: EmojiCompat */
    public static abstract class C1020e {
        /* renamed from: a */
        public void mo3646a(Throwable th) {
        }

        /* renamed from: b */
        public void mo3647b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    /* compiled from: EmojiCompat */
    private static class C1021f implements Runnable {

        /* renamed from: a */
        private final List<C1020e> f2746a;

        /* renamed from: b */
        private final Throwable f2747b;

        /* renamed from: c */
        private final int f2748c;

        C1021f(C1020e eVar, int i) {
            this(Arrays.asList(new C1020e[]{(C1020e) C0831h.m3663g(eVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        public void run() {
            int size = this.f2746a.size();
            int i = 0;
            if (this.f2748c != 1) {
                while (i < size) {
                    this.f2746a.get(i).mo3646a(this.f2747b);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f2746a.get(i).mo3647b();
                i++;
            }
        }

        C1021f(Collection<C1020e> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        C1021f(Collection<C1020e> collection, int i, Throwable th) {
            C0831h.m3663g(collection, "initCallbacks cannot be null");
            this.f2746a = new ArrayList(collection);
            this.f2748c = i;
            this.f2747b = th;
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    /* compiled from: EmojiCompat */
    public interface C1022g {
        /* renamed from: a */
        void mo3615a(C1023h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    /* compiled from: EmojiCompat */
    public static abstract class C1023h {
        /* renamed from: a */
        public abstract void mo3617a(Throwable th);

        /* renamed from: b */
        public abstract void mo3618b(C1039m mVar);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    /* compiled from: EmojiCompat */
    static class C1024i {
        C1024i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1030i mo3649a(C1026g gVar) {
            return new C1043o(gVar);
        }
    }

    private C1014e(C1018c cVar) {
        this.f2726g = cVar.f2738b;
        this.f2727h = cVar.f2739c;
        this.f2728i = cVar.f2740d;
        this.f2729j = cVar.f2742f;
        this.f2730k = cVar.f2743g;
        this.f2725f = cVar.f2737a;
        this.f2731l = cVar.f2744h;
        this.f2732m = cVar.f2745i;
        this.f2723d = new Handler(Looper.getMainLooper());
        C5415b bVar = new C5415b();
        this.f2721b = bVar;
        Set<C1020e> set = cVar.f2741e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2741e);
        }
        this.f2724e = Build.VERSION.SDK_INT < 19 ? new C1017b(this) : new C1015a(this);
        m4550l();
    }

    /* renamed from: b */
    public static C1014e m4544b() {
        C1014e eVar;
        synchronized (f2717n) {
            eVar = f2719p;
            C0831h.m3664h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    /* renamed from: e */
    public static boolean m4545e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1027h.m4595c(inputConnection, editable, i, i2, z);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m4546f(Editable editable, int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1027h.m4596d(editable, i, keyEvent);
        }
        return false;
    }

    /* renamed from: g */
    public static C1014e m4547g(C1018c cVar) {
        C1014e eVar = f2719p;
        if (eVar == null) {
            synchronized (f2717n) {
                eVar = f2719p;
                if (eVar == null) {
                    eVar = new C1014e(cVar);
                    f2719p = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public static boolean m4548h() {
        return f2719p != null;
    }

    /* renamed from: j */
    private boolean m4549j() {
        return mo3628d() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private void m4550l() {
        this.f2720a.writeLock().lock();
        try {
            if (this.f2731l == 0) {
                this.f2722c = 0;
            }
            this.f2720a.writeLock().unlock();
            if (mo3628d() == 0) {
                this.f2724e.mo3640a();
            }
        } catch (Throwable th) {
            this.f2720a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public int mo3627c() {
        return this.f2730k;
    }

    /* renamed from: d */
    public int mo3628d() {
        this.f2720a.readLock().lock();
        try {
            return this.f2722c;
        } finally {
            this.f2720a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean mo3629i() {
        return this.f2729j;
    }

    /* renamed from: k */
    public void mo3630k() {
        boolean z = true;
        if (this.f2731l != 1) {
            z = false;
        }
        C0831h.m3664h(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m4549j()) {
            this.f2720a.writeLock().lock();
            try {
                if (this.f2722c != 0) {
                    this.f2722c = 0;
                    this.f2720a.writeLock().unlock();
                    this.f2724e.mo3640a();
                }
            } finally {
                this.f2720a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3631m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2720a.writeLock().lock();
        try {
            this.f2722c = 2;
            arrayList.addAll(this.f2721b);
            this.f2721b.clear();
            this.f2720a.writeLock().unlock();
            this.f2723d.post(new C1021f(arrayList, this.f2722c, th));
        } catch (Throwable th2) {
            this.f2720a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3632n() {
        ArrayList arrayList = new ArrayList();
        this.f2720a.writeLock().lock();
        try {
            this.f2722c = 1;
            arrayList.addAll(this.f2721b);
            this.f2721b.clear();
            this.f2720a.writeLock().unlock();
            this.f2723d.post(new C1021f((Collection<C1020e>) arrayList, this.f2722c));
        } catch (Throwable th) {
            this.f2720a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence mo3633o(CharSequence charSequence) {
        return mo3634p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence mo3634p(CharSequence charSequence, int i, int i2) {
        return mo3635q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence mo3635q(CharSequence charSequence, int i, int i2, int i3) {
        return mo3636r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence mo3636r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        C0831h.m3664h(m4549j(), "Not initialized yet");
        C0831h.m3660d(i, "start cannot be negative");
        C0831h.m3660d(i2, "end cannot be negative");
        C0831h.m3660d(i3, "maxEmojiCount cannot be negative");
        C0831h.m3657a(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C0831h.m3657a(i <= charSequence.length(), "start should be < than charSequence length");
        C0831h.m3657a(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.f2724e.mo3641b(charSequence, i, i2, i3, i4 != 1 ? i4 != 2 ? this.f2726g : false : true);
    }

    /* renamed from: s */
    public void mo3637s(C1020e eVar) {
        C0831h.m3663g(eVar, "initCallback cannot be null");
        this.f2720a.writeLock().lock();
        try {
            if (this.f2722c != 1) {
                if (this.f2722c != 2) {
                    this.f2721b.add(eVar);
                }
            }
            this.f2723d.post(new C1021f(eVar, this.f2722c));
        } finally {
            this.f2720a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void mo3638t(C1020e eVar) {
        C0831h.m3663g(eVar, "initCallback cannot be null");
        this.f2720a.writeLock().lock();
        try {
            this.f2721b.remove(eVar);
        } finally {
            this.f2720a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void mo3639u(EditorInfo editorInfo) {
        if (m4549j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f2724e.mo3642c(editorInfo);
        }
    }
}
