package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10412f;
import p257i8.C10562j;
import p267j8.C11499a;
import p285l8.C11765e;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11966r;
import p367u8.C12707h;
import p367u8.C12709i;

@Keep
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final class Registrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    private static class C7968a implements C11499a {

        /* renamed from: a */
        final FirebaseInstanceId f34480a;

        public C7968a(FirebaseInstanceId firebaseInstanceId) {
            this.f34480a = firebaseInstanceId;
        }

        /* renamed from: a */
        public String mo26517a() {
            return this.f34480a.mo26509n();
        }

        /* renamed from: b */
        public void mo26518b(String str, String str2) throws IOException {
            this.f34480a.mo26503f(str, str2);
        }

        /* renamed from: c */
        public C9975i<String> mo26519c() {
            String n = this.f34480a.mo26509n();
            if (n != null) {
                return C9980l.m51031e(n);
            }
            return this.f34480a.mo26508j().mo26353h(C7985q.f34516a);
        }

        /* renamed from: d */
        public void mo26520d(C11499a.C11500a aVar) {
            this.f34480a.mo26501a(aVar);
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(C11940e eVar) {
        return new FirebaseInstanceId((C10412f) eVar.mo36263a(C10412f.class), eVar.mo36266d(C12709i.class), eVar.mo36266d(C10562j.class), (C11765e) eVar.mo36263a(C11765e.class));
    }

    static final /* synthetic */ C11499a lambda$getComponents$1$Registrar(C11940e eVar) {
        return new C7968a((FirebaseInstanceId) eVar.mo36263a(FirebaseInstanceId.class));
    }

    @Keep
    public List<C11934c<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new C11934c[]{C11934c.m57617c(cls).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57743i(C12709i.class)).mo36256b(C11966r.m57743i(C10562j.class)).mo36256b(C11966r.m57744j(C11765e.class)).mo36260f(C7983o.f34514a).mo36257c().mo36258d(), C11934c.m57617c(C11499a.class).mo36256b(C11966r.m57744j(cls)).mo36260f(C7984p.f34515a).mo36258d(), C12707h.m60249b("fire-iid", "21.1.0")});
    }
}
