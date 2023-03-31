package p351sb;

import android.content.Context;
import p186ac.C6539c;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.plugin.platform.C10733h;
import p264io.flutter.view.C11091f;

/* renamed from: sb.a */
/* compiled from: FlutterPlugin */
public interface C12502a {

    /* renamed from: sb.a$a */
    /* compiled from: FlutterPlugin */
    public interface C12503a {
        /* renamed from: a */
        String mo34110a(String str);
    }

    /* renamed from: sb.a$b */
    /* compiled from: FlutterPlugin */
    public static class C12504b {

        /* renamed from: a */
        private final Context f45956a;

        /* renamed from: b */
        private final C10685a f45957b;

        /* renamed from: c */
        private final C6539c f45958c;

        /* renamed from: d */
        private final C11091f f45959d;

        /* renamed from: e */
        private final C10733h f45960e;

        /* renamed from: f */
        private final C12503a f45961f;

        public C12504b(Context context, C10685a aVar, C6539c cVar, C11091f fVar, C10733h hVar, C12503a aVar2) {
            this.f45956a = context;
            this.f45957b = aVar;
            this.f45958c = cVar;
            this.f45959d = fVar;
            this.f45960e = hVar;
            this.f45961f = aVar2;
        }

        /* renamed from: a */
        public Context mo37292a() {
            return this.f45956a;
        }

        /* renamed from: b */
        public C6539c mo37293b() {
            return this.f45958c;
        }

        /* renamed from: c */
        public C12503a mo37294c() {
            return this.f45961f;
        }

        @Deprecated
        /* renamed from: d */
        public C10685a mo37295d() {
            return this.f45957b;
        }

        /* renamed from: e */
        public C10733h mo37296e() {
            return this.f45960e;
        }

        /* renamed from: f */
        public C11091f mo37297f() {
            return this.f45959d;
        }
    }

    void onAttachedToEngine(C12504b bVar);

    void onDetachedFromEngine(C12504b bVar);
}
