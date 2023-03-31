package p157w;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: w.d */
/* compiled from: InputContentInfoCompat */
public final class C5867d {

    /* renamed from: a */
    private final C5870c f28994a;

    /* renamed from: w.d$b */
    /* compiled from: InputContentInfoCompat */
    private static final class C5869b implements C5870c {

        /* renamed from: a */
        private final Uri f28996a;

        /* renamed from: b */
        private final ClipDescription f28997b;

        /* renamed from: c */
        private final Uri f28998c;

        C5869b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f28996a = uri;
            this.f28997b = clipDescription;
            this.f28998c = uri2;
        }

        /* renamed from: a */
        public Uri mo20417a() {
            return this.f28996a;
        }

        /* renamed from: b */
        public void mo20418b() {
        }

        /* renamed from: c */
        public Uri mo20419c() {
            return this.f28998c;
        }

        /* renamed from: d */
        public Object mo20420d() {
            return null;
        }

        public ClipDescription getDescription() {
            return this.f28997b;
        }
    }

    /* renamed from: w.d$c */
    /* compiled from: InputContentInfoCompat */
    private interface C5870c {
        /* renamed from: a */
        Uri mo20417a();

        /* renamed from: b */
        void mo20418b();

        /* renamed from: c */
        Uri mo20419c();

        /* renamed from: d */
        Object mo20420d();

        ClipDescription getDescription();
    }

    public C5867d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f28994a = new C5868a(uri, clipDescription, uri2);
        } else {
            this.f28994a = new C5869b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C5867d m34751f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C5867d(new C5868a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri mo20412a() {
        return this.f28994a.mo20417a();
    }

    /* renamed from: b */
    public ClipDescription mo20413b() {
        return this.f28994a.getDescription();
    }

    /* renamed from: c */
    public Uri mo20414c() {
        return this.f28994a.mo20419c();
    }

    /* renamed from: d */
    public void mo20415d() {
        this.f28994a.mo20418b();
    }

    /* renamed from: e */
    public Object mo20416e() {
        return this.f28994a.mo20420d();
    }

    /* renamed from: w.d$a */
    /* compiled from: InputContentInfoCompat */
    private static final class C5868a implements C5870c {

        /* renamed from: a */
        final InputContentInfo f28995a;

        C5868a(Object obj) {
            this.f28995a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public Uri mo20417a() {
            return this.f28995a.getContentUri();
        }

        /* renamed from: b */
        public void mo20418b() {
            this.f28995a.requestPermission();
        }

        /* renamed from: c */
        public Uri mo20419c() {
            return this.f28995a.getLinkUri();
        }

        /* renamed from: d */
        public Object mo20420d() {
            return this.f28995a;
        }

        public ClipDescription getDescription() {
            return this.f28995a.getDescription();
        }

        C5868a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f28995a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C5867d(C5870c cVar) {
        this.f28994a = cVar;
    }
}
