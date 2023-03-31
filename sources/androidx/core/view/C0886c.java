package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C0831h;
import java.util.Objects;

/* renamed from: androidx.core.view.c */
/* compiled from: ContentInfoCompat */
public final class C0886c {

    /* renamed from: a */
    private final C0892f f2536a;

    /* renamed from: androidx.core.view.c$a */
    /* compiled from: ContentInfoCompat */
    public static final class C0887a {

        /* renamed from: a */
        private final C0889c f2537a;

        public C0887a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2537a = new C0888b(clipData, i);
            } else {
                this.f2537a = new C0890d(clipData, i);
            }
        }

        /* renamed from: a */
        public C0886c mo3363a() {
            return this.f2537a.build();
        }

        /* renamed from: b */
        public C0887a mo3364b(Bundle bundle) {
            this.f2537a.mo3367a(bundle);
            return this;
        }

        /* renamed from: c */
        public C0887a mo3365c(int i) {
            this.f2537a.mo3370c(i);
            return this;
        }

        /* renamed from: d */
        public C0887a mo3366d(Uri uri) {
            this.f2537a.mo3368b(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.c$b */
    /* compiled from: ContentInfoCompat */
    private static final class C0888b implements C0889c {

        /* renamed from: a */
        private final ContentInfo.Builder f2538a;

        C0888b(ClipData clipData, int i) {
            this.f2538a = new ContentInfo.Builder(clipData, i);
        }

        /* renamed from: a */
        public void mo3367a(Bundle bundle) {
            this.f2538a.setExtras(bundle);
        }

        /* renamed from: b */
        public void mo3368b(Uri uri) {
            this.f2538a.setLinkUri(uri);
        }

        public C0886c build() {
            return new C0886c(new C0891e(this.f2538a.build()));
        }

        /* renamed from: c */
        public void mo3370c(int i) {
            this.f2538a.setFlags(i);
        }
    }

    /* renamed from: androidx.core.view.c$c */
    /* compiled from: ContentInfoCompat */
    private interface C0889c {
        /* renamed from: a */
        void mo3367a(Bundle bundle);

        /* renamed from: b */
        void mo3368b(Uri uri);

        C0886c build();

        /* renamed from: c */
        void mo3370c(int i);
    }

    /* renamed from: androidx.core.view.c$d */
    /* compiled from: ContentInfoCompat */
    private static final class C0890d implements C0889c {

        /* renamed from: a */
        ClipData f2539a;

        /* renamed from: b */
        int f2540b;

        /* renamed from: c */
        int f2541c;

        /* renamed from: d */
        Uri f2542d;

        /* renamed from: e */
        Bundle f2543e;

        C0890d(ClipData clipData, int i) {
            this.f2539a = clipData;
            this.f2540b = i;
        }

        /* renamed from: a */
        public void mo3367a(Bundle bundle) {
            this.f2543e = bundle;
        }

        /* renamed from: b */
        public void mo3368b(Uri uri) {
            this.f2542d = uri;
        }

        public C0886c build() {
            return new C0886c(new C0893g(this));
        }

        /* renamed from: c */
        public void mo3370c(int i) {
            this.f2541c = i;
        }
    }

    /* renamed from: androidx.core.view.c$e */
    /* compiled from: ContentInfoCompat */
    private static final class C0891e implements C0892f {

        /* renamed from: a */
        private final ContentInfo f2544a;

        C0891e(ContentInfo contentInfo) {
            this.f2544a = (ContentInfo) C0831h.m3662f(contentInfo);
        }

        /* renamed from: J0 */
        public int mo3371J0() {
            return this.f2544a.getFlags();
        }

        /* renamed from: a */
        public ClipData mo3372a() {
            return this.f2544a.getClip();
        }

        /* renamed from: b */
        public ContentInfo mo3373b() {
            return this.f2544a;
        }

        /* renamed from: c */
        public int mo3374c() {
            return this.f2544a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2544a + "}";
        }
    }

    /* renamed from: androidx.core.view.c$f */
    /* compiled from: ContentInfoCompat */
    private interface C0892f {
        /* renamed from: J0 */
        int mo3371J0();

        /* renamed from: a */
        ClipData mo3372a();

        /* renamed from: b */
        ContentInfo mo3373b();

        /* renamed from: c */
        int mo3374c();
    }

    /* renamed from: androidx.core.view.c$g */
    /* compiled from: ContentInfoCompat */
    private static final class C0893g implements C0892f {

        /* renamed from: a */
        private final ClipData f2545a;

        /* renamed from: b */
        private final int f2546b;

        /* renamed from: c */
        private final int f2547c;

        /* renamed from: d */
        private final Uri f2548d;

        /* renamed from: e */
        private final Bundle f2549e;

        C0893g(C0890d dVar) {
            this.f2545a = (ClipData) C0831h.m3662f(dVar.f2539a);
            this.f2546b = C0831h.m3658b(dVar.f2540b, 0, 5, "source");
            this.f2547c = C0831h.m3661e(dVar.f2541c, 1);
            this.f2548d = dVar.f2542d;
            this.f2549e = dVar.f2543e;
        }

        /* renamed from: J0 */
        public int mo3371J0() {
            return this.f2547c;
        }

        /* renamed from: a */
        public ClipData mo3372a() {
            return this.f2545a;
        }

        /* renamed from: b */
        public ContentInfo mo3373b() {
            return null;
        }

        /* renamed from: c */
        public int mo3374c() {
            return this.f2546b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2545a.getDescription());
            sb.append(", source=");
            sb.append(C0886c.m4028e(this.f2546b));
            sb.append(", flags=");
            sb.append(C0886c.m4027a(this.f2547c));
            String str2 = "";
            if (this.f2548d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f2548d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f2549e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    C0886c(C0892f fVar) {
        this.f2536a = fVar;
    }

    /* renamed from: a */
    static String m4027a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    static String m4028e(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i != 4) {
            return i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    /* renamed from: g */
    public static C0886c m4029g(ContentInfo contentInfo) {
        return new C0886c(new C0891e(contentInfo));
    }

    /* renamed from: b */
    public ClipData mo3358b() {
        return this.f2536a.mo3372a();
    }

    /* renamed from: c */
    public int mo3359c() {
        return this.f2536a.mo3371J0();
    }

    /* renamed from: d */
    public int mo3360d() {
        return this.f2536a.mo3374c();
    }

    /* renamed from: f */
    public ContentInfo mo3361f() {
        ContentInfo b = this.f2536a.mo3373b();
        Objects.requireNonNull(b);
        ContentInfo contentInfo = b;
        return b;
    }

    public String toString() {
        return this.f2536a.toString();
    }
}
