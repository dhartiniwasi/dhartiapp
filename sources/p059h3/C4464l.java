package p059h3;

import android.net.Uri;
import java.io.IOException;
import p015b3.C1700e0;
import p052g3.C4372g;
import p155v3.C5804g0;

/* renamed from: h3.l */
/* compiled from: HlsPlaylistTracker */
public interface C4464l {

    /* renamed from: h3.l$a */
    /* compiled from: HlsPlaylistTracker */
    public interface C4465a {
        /* renamed from: a */
        C4464l mo18010a(C4372g gVar, C5804g0 g0Var, C4463k kVar);
    }

    /* renamed from: h3.l$b */
    /* compiled from: HlsPlaylistTracker */
    public interface C4466b {
        /* renamed from: a */
        void mo17838a();

        /* renamed from: j */
        boolean mo17839j(Uri uri, C5804g0.C5807c cVar, boolean z);
    }

    /* renamed from: h3.l$c */
    /* compiled from: HlsPlaylistTracker */
    public static final class C4467c extends IOException {

        /* renamed from: a */
        public final Uri f24817a;

        public C4467c(Uri uri) {
            this.f24817a = uri;
        }
    }

    /* renamed from: h3.l$d */
    /* compiled from: HlsPlaylistTracker */
    public static final class C4468d extends IOException {

        /* renamed from: a */
        public final Uri f24818a;

        public C4468d(Uri uri) {
            this.f24818a = uri;
        }
    }

    /* renamed from: h3.l$e */
    /* compiled from: HlsPlaylistTracker */
    public interface C4469e {
        /* renamed from: e */
        void mo7790e(C4449g gVar);
    }

    /* renamed from: a */
    boolean mo17975a(Uri uri);

    /* renamed from: b */
    void mo17976b(Uri uri) throws IOException;

    /* renamed from: c */
    void mo17977c(Uri uri, C1700e0.C1701a aVar, C4469e eVar);

    /* renamed from: d */
    void mo17978d(C4466b bVar);

    /* renamed from: e */
    long mo17979e();

    /* renamed from: f */
    void mo17980f(C4466b bVar);

    /* renamed from: g */
    boolean mo17981g();

    /* renamed from: h */
    C4456h mo17982h();

    /* renamed from: i */
    boolean mo17983i(Uri uri, long j);

    /* renamed from: k */
    void mo17984k() throws IOException;

    /* renamed from: l */
    void mo17985l(Uri uri);

    /* renamed from: m */
    C4449g mo17986m(Uri uri, boolean z);

    void stop();
}
