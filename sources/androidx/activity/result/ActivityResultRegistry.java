package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0623c;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p041f.C4246a;

public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f584a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f585b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f586c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0253d> f587d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f588e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0252c<?>> f589f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f590g = new HashMap();

    /* renamed from: h */
    final Bundle f591h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    class C0250a extends C0257c<I> {

        /* renamed from: a */
        final /* synthetic */ String f596a;

        /* renamed from: b */
        final /* synthetic */ C4246a f597b;

        C0250a(String str, C4246a aVar) {
            this.f596a = str;
            this.f597b = aVar;
        }

        /* renamed from: b */
        public void mo782b(I i, C0623c cVar) {
            Integer num = ActivityResultRegistry.this.f586c.get(this.f596a);
            if (num != null) {
                ActivityResultRegistry.this.f588e.add(this.f596a);
                try {
                    ActivityResultRegistry.this.mo754f(num.intValue(), this.f597b, i, cVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f588e.remove(this.f596a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f597b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: c */
        public void mo783c() {
            ActivityResultRegistry.this.mo781l(this.f596a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    class C0251b extends C0257c<I> {

        /* renamed from: a */
        final /* synthetic */ String f599a;

        /* renamed from: b */
        final /* synthetic */ C4246a f600b;

        C0251b(String str, C4246a aVar) {
            this.f599a = str;
            this.f600b = aVar;
        }

        /* renamed from: b */
        public void mo782b(I i, C0623c cVar) {
            Integer num = ActivityResultRegistry.this.f586c.get(this.f599a);
            if (num != null) {
                ActivityResultRegistry.this.f588e.add(this.f599a);
                try {
                    ActivityResultRegistry.this.mo754f(num.intValue(), this.f600b, i, cVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f588e.remove(this.f599a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f600b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: c */
        public void mo783c() {
            ActivityResultRegistry.this.mo781l(this.f599a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    private static class C0252c<O> {

        /* renamed from: a */
        final C0256b<O> f602a;

        /* renamed from: b */
        final C4246a<?, O> f603b;

        C0252c(C0256b<O> bVar, C4246a<?, O> aVar) {
            this.f602a = bVar;
            this.f603b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    private static class C0253d {

        /* renamed from: a */
        final C1208j f604a;

        /* renamed from: b */
        private final ArrayList<C1216l> f605b = new ArrayList<>();

        C0253d(C1208j jVar) {
            this.f604a = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo784a(C1216l lVar) {
            this.f604a.mo4399a(lVar);
            this.f605b.add(lVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo785b() {
            Iterator<C1216l> it = this.f605b.iterator();
            while (it.hasNext()) {
                this.f604a.mo4401c(it.next());
            }
            this.f605b.clear();
        }
    }

    /* renamed from: a */
    private void m1229a(int i, String str) {
        this.f585b.put(Integer.valueOf(i), str);
        this.f586c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private <O> void m1230d(String str, int i, Intent intent, C0252c<O> cVar) {
        if (cVar == null || cVar.f602a == null || !this.f588e.contains(str)) {
            this.f590g.remove(str);
            this.f591h.putParcelable(str, new C0254a(i, intent));
            return;
        }
        cVar.f602a.mo795a(cVar.f603b.mo4185c(i, intent));
        this.f588e.remove(str);
    }

    /* renamed from: e */
    private int m1231e() {
        int nextInt = this.f584a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f585b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f584a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private void m1232k(String str) {
        if (this.f586c.get(str) == null) {
            m1229a(m1231e(), str);
        }
    }

    /* renamed from: b */
    public final boolean mo775b(int i, int i2, Intent intent) {
        String str = this.f585b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m1230d(str, i2, intent, this.f589f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean mo776c(int i, O o) {
        C0256b<O> bVar;
        String str = this.f585b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0252c cVar = this.f589f.get(str);
        if (cVar == null || (bVar = cVar.f602a) == null) {
            this.f591h.remove(str);
            this.f590g.put(str, o);
            return true;
        } else if (!this.f588e.remove(str)) {
            return true;
        } else {
            bVar.mo795a(o);
            return true;
        }
    }

    /* renamed from: f */
    public abstract <I, O> void mo754f(int i, C4246a<I, O> aVar, I i2, C0623c cVar);

    /* renamed from: g */
    public final void mo777g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f588e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f584a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f591h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f586c.containsKey(str)) {
                        Integer remove = this.f586c.remove(str);
                        if (!this.f591h.containsKey(str)) {
                            this.f585b.remove(remove);
                        }
                    }
                    m1229a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo778h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f586c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f586c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f588e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f591h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f584a);
    }

    /* renamed from: i */
    public final <I, O> C0257c<I> mo779i(final String str, C1220n nVar, final C4246a<I, O> aVar, final C0256b<O> bVar) {
        C1208j lifecycle = nVar.getLifecycle();
        if (!lifecycle.mo4400b().mo4403a(C1208j.C1211c.STARTED)) {
            m1232k(str);
            C0253d dVar = this.f587d.get(str);
            if (dVar == null) {
                dVar = new C0253d(lifecycle);
            }
            dVar.mo784a(new C1216l() {
                /* renamed from: c */
                public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
                    if (C1208j.C1210b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f589f.put(str, new C0252c(bVar, aVar));
                        if (ActivityResultRegistry.this.f590g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f590g.get(str);
                            ActivityResultRegistry.this.f590g.remove(str);
                            bVar.mo795a(obj);
                        }
                        C0254a aVar = (C0254a) ActivityResultRegistry.this.f591h.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f591h.remove(str);
                            bVar.mo795a(aVar.mo4185c(aVar.mo787b(), aVar.mo786a()));
                        }
                    } else if (C1208j.C1210b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f589f.remove(str);
                    } else if (C1208j.C1210b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.mo781l(str);
                    }
                }
            });
            this.f587d.put(str, dVar);
            return new C0250a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + nVar + " is attempting to register while current state is " + lifecycle.mo4400b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: j */
    public final <I, O> C0257c<I> mo780j(String str, C4246a<I, O> aVar, C0256b<O> bVar) {
        m1232k(str);
        this.f589f.put(str, new C0252c(bVar, aVar));
        if (this.f590g.containsKey(str)) {
            Object obj = this.f590g.get(str);
            this.f590g.remove(str);
            bVar.mo795a(obj);
        }
        C0254a aVar2 = (C0254a) this.f591h.getParcelable(str);
        if (aVar2 != null) {
            this.f591h.remove(str);
            bVar.mo795a(aVar.mo4185c(aVar2.mo787b(), aVar2.mo786a()));
        }
        return new C0251b(str, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo781l(String str) {
        Integer remove;
        if (!this.f588e.contains(str) && (remove = this.f586c.remove(str)) != null) {
            this.f585b.remove(remove);
        }
        this.f589f.remove(str);
        if (this.f590g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f590g.get(str));
            this.f590g.remove(str);
        }
        if (this.f591h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f591h.getParcelable(str));
            this.f591h.remove(str);
        }
        C0253d dVar = this.f587d.get(str);
        if (dVar != null) {
            dVar.mo785b();
            this.f587d.remove(str);
        }
    }
}
