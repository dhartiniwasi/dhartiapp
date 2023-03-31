package p264io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1208j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p186ac.C6563m;
import p186ac.C6564n;
import p186ac.C6566p;
import p186ac.C6567q;
import p264io.flutter.embedding.android.C10627c;
import p264io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import p297mb.C11881b;
import p325pc.C12169e;
import p333qb.C12212f;
import p351sb.C12502a;
import p351sb.C12505b;
import p360tb.C12588a;
import p360tb.C12589b;
import p360tb.C12590c;
import p370ub.C12723a;
import p370ub.C12724b;
import p380vb.C12868a;
import p380vb.C12869b;
import p390wb.C12940a;
import p390wb.C12941b;

/* renamed from: io.flutter.embedding.engine.c */
/* compiled from: FlutterEngineConnectionRegistry */
class C10689c implements C12505b, C12589b {

    /* renamed from: a */
    private final Map<Class<? extends C12502a>, C12502a> f41899a = new HashMap();

    /* renamed from: b */
    private final C10685a f41900b;

    /* renamed from: c */
    private final C12502a.C12504b f41901c;

    /* renamed from: d */
    private final Map<Class<? extends C12502a>, C12588a> f41902d = new HashMap();

    /* renamed from: e */
    private C10627c<Activity> f41903e;

    /* renamed from: f */
    private C10692c f41904f;

    /* renamed from: g */
    private boolean f41905g = false;

    /* renamed from: h */
    private final Map<Class<? extends C12502a>, C12940a> f41906h = new HashMap();

    /* renamed from: i */
    private Service f41907i;

    /* renamed from: j */
    private C10695f f41908j;

    /* renamed from: k */
    private final Map<Class<? extends C12502a>, C12723a> f41909k = new HashMap();

    /* renamed from: l */
    private BroadcastReceiver f41910l;

    /* renamed from: m */
    private C10693d f41911m;

    /* renamed from: n */
    private final Map<Class<? extends C12502a>, C12868a> f41912n = new HashMap();

    /* renamed from: o */
    private ContentProvider f41913o;

    /* renamed from: p */
    private C10694e f41914p;

    /* renamed from: io.flutter.embedding.engine.c$b */
    /* compiled from: FlutterEngineConnectionRegistry */
    private static class C10691b implements C12502a.C12503a {

        /* renamed from: a */
        final C12212f f41915a;

        /* renamed from: a */
        public String mo34110a(String str) {
            return this.f41915a.mo36743k(str);
        }

        private C10691b(C12212f fVar) {
            this.f41915a = fVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c */
    /* compiled from: FlutterEngineConnectionRegistry */
    private static class C10692c implements C12590c {

        /* renamed from: a */
        private final Activity f41916a;

        /* renamed from: b */
        private final HiddenLifecycleReference f41917b;

        /* renamed from: c */
        private final Set<C6566p> f41918c = new HashSet();

        /* renamed from: d */
        private final Set<C6563m> f41919d = new HashSet();

        /* renamed from: e */
        private final Set<C6564n> f41920e = new HashSet();

        /* renamed from: f */
        private final Set<C6567q> f41921f = new HashSet();

        /* renamed from: g */
        private final Set<C12590c.C12591a> f41922g = new HashSet();

        public C10692c(Activity activity, C1208j jVar) {
            this.f41916a = activity;
            this.f41917b = new HiddenLifecycleReference(jVar);
        }

        /* renamed from: a */
        public void mo34111a(C6563m mVar) {
            this.f41919d.add(mVar);
        }

        /* renamed from: b */
        public void mo34112b(C6566p pVar) {
            this.f41918c.add(pVar);
        }

        /* renamed from: c */
        public void mo34113c(C6566p pVar) {
            this.f41918c.remove(pVar);
        }

        /* renamed from: d */
        public void mo34114d(C6564n nVar) {
            this.f41920e.add(nVar);
        }

        /* renamed from: e */
        public void mo34115e(C6564n nVar) {
            this.f41920e.remove(nVar);
        }

        /* renamed from: f */
        public void mo34116f(C6563m mVar) {
            this.f41919d.remove(mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo34117g(int i, int i2, Intent intent) {
            Iterator it = new HashSet(this.f41919d).iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (((C6563m) it.next()).onActivityResult(i, i2, intent) || z) {
                        z = true;
                    }
                }
            }
        }

        public Activity getActivity() {
            return this.f41916a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo34119h(Intent intent) {
            for (C6564n d : this.f41920e) {
                d.mo22165d(intent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo34120i(int i, String[] strArr, int[] iArr) {
            Iterator<C6566p> it = this.f41918c.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (it.next().onRequestPermissionsResult(i, strArr, iArr) || z) {
                        z = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo34121j(Bundle bundle) {
            for (C12590c.C12591a b : this.f41922g) {
                b.mo37433b(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo34122k(Bundle bundle) {
            for (C12590c.C12591a onSaveInstanceState : this.f41922g) {
                onSaveInstanceState.onSaveInstanceState(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo34123l() {
            for (C6567q c : this.f41921f) {
                c.mo22174c();
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$d */
    /* compiled from: FlutterEngineConnectionRegistry */
    private static class C10693d implements C12724b {
    }

    /* renamed from: io.flutter.embedding.engine.c$e */
    /* compiled from: FlutterEngineConnectionRegistry */
    private static class C10694e implements C12869b {
    }

    /* renamed from: io.flutter.embedding.engine.c$f */
    /* compiled from: FlutterEngineConnectionRegistry */
    private static class C10695f implements C12941b {
    }

    C10689c(Context context, C10685a aVar, C12212f fVar) {
        this.f41900b = aVar;
        this.f41901c = new C12502a.C12504b(context, aVar, aVar.mo34072i(), aVar.mo34080q(), aVar.mo34078o().mo34300P(), new C10691b(fVar));
    }

    /* renamed from: i */
    private void m53510i(Activity activity, C1208j jVar) {
        this.f41904f = new C10692c(activity, jVar);
        this.f41900b.mo34078o().mo34309h0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f41900b.mo34078o().mo34289B(activity, this.f41900b.mo34080q(), this.f41900b.mo34072i());
        for (C12588a next : this.f41902d.values()) {
            if (this.f41905g) {
                next.onReattachedToActivityForConfigChanges(this.f41904f);
            } else {
                next.onAttachedToActivity(this.f41904f);
            }
        }
        this.f41905g = false;
    }

    /* renamed from: k */
    private void m53511k() {
        this.f41900b.mo34078o().mo34297J();
        this.f41903e = null;
        this.f41904f = null;
    }

    /* renamed from: l */
    private void m53512l() {
        if (m53513q()) {
            mo34097g();
        } else if (m53516t()) {
            mo34102o();
        } else if (m53514r()) {
            mo34100m();
        } else if (m53515s()) {
            mo34101n();
        }
    }

    /* renamed from: q */
    private boolean m53513q() {
        return this.f41903e != null;
    }

    /* renamed from: r */
    private boolean m53514r() {
        return this.f41910l != null;
    }

    /* renamed from: s */
    private boolean m53515s() {
        return this.f41913o != null;
    }

    /* renamed from: t */
    private boolean m53516t() {
        return this.f41907i != null;
    }

    /* renamed from: a */
    public C12502a mo34091a(Class<? extends C12502a> cls) {
        return this.f41899a.get(cls);
    }

    /* renamed from: b */
    public void mo34092b(Bundle bundle) {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f41904f.mo34121j(bundle);
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    /* renamed from: c */
    public void mo34093c() {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f41904f.mo34123l();
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    /* renamed from: d */
    public void mo34094d(Intent intent) {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f41904f.mo34119h(intent);
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    /* renamed from: e */
    public void mo34095e(C10627c<Activity> cVar, C1208j jVar) {
        C12169e.m58443a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C10627c<Activity> cVar2 = this.f41903e;
            if (cVar2 != null) {
                cVar2.mo33846c();
            }
            m53512l();
            this.f41903e = cVar;
            m53510i(cVar.mo33847d(), jVar);
        } finally {
            C12169e.m58446d();
        }
    }

    /* renamed from: f */
    public void mo34096f(C12502a aVar) {
        C12169e.m58443a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (mo34106p(aVar.getClass())) {
                C11881b.m57389g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f41900b + ").");
                return;
            }
            C11881b.m57388f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f41899a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f41901c);
            if (aVar instanceof C12588a) {
                C12588a aVar2 = (C12588a) aVar;
                this.f41902d.put(aVar.getClass(), aVar2);
                if (m53513q()) {
                    aVar2.onAttachedToActivity(this.f41904f);
                }
            }
            if (aVar instanceof C12940a) {
                C12940a aVar3 = (C12940a) aVar;
                this.f41906h.put(aVar.getClass(), aVar3);
                if (m53516t()) {
                    aVar3.mo37984b(this.f41908j);
                }
            }
            if (aVar instanceof C12723a) {
                C12723a aVar4 = (C12723a) aVar;
                this.f41909k.put(aVar.getClass(), aVar4);
                if (m53514r()) {
                    aVar4.mo37627a(this.f41911m);
                }
            }
            if (aVar instanceof C12868a) {
                C12868a aVar5 = (C12868a) aVar;
                this.f41912n.put(aVar.getClass(), aVar5);
                if (m53515s()) {
                    aVar5.mo37886b(this.f41914p);
                }
            }
            C12169e.m58446d();
        } finally {
            C12169e.m58446d();
        }
    }

    /* renamed from: g */
    public void mo34097g() {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (C12588a onDetachedFromActivity : this.f41902d.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                m53511k();
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    /* renamed from: h */
    public void mo34098h() {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f41905g = true;
                for (C12588a onDetachedFromActivityForConfigChanges : this.f41902d.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                m53511k();
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    /* renamed from: j */
    public void mo34099j() {
        C11881b.m57388f("FlutterEngineCxnRegstry", "Destroying.");
        m53512l();
        mo34109w();
    }

    /* renamed from: m */
    public void mo34100m() {
        if (m53514r()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (C12723a b : this.f41909k.values()) {
                    b.mo37628b();
                }
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    /* renamed from: n */
    public void mo34101n() {
        if (m53515s()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (C12868a a : this.f41912n.values()) {
                    a.mo37885a();
                }
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    /* renamed from: o */
    public void mo34102o() {
        if (m53516t()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (C12940a a : this.f41906h.values()) {
                    a.mo37983a();
                }
                this.f41907i = null;
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.f41904f.mo34117g(i, i2, intent);
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.f41904f.mo34120i(i, strArr, iArr);
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (m53513q()) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f41904f.mo34122k(bundle);
            } finally {
                C12169e.m58446d();
            }
        } else {
            C11881b.m57384b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    /* renamed from: p */
    public boolean mo34106p(Class<? extends C12502a> cls) {
        return this.f41899a.containsKey(cls);
    }

    /* renamed from: u */
    public void mo34107u(Class<? extends C12502a> cls) {
        C12502a aVar = this.f41899a.get(cls);
        if (aVar != null) {
            C12169e.m58443a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof C12588a) {
                    if (m53513q()) {
                        ((C12588a) aVar).onDetachedFromActivity();
                    }
                    this.f41902d.remove(cls);
                }
                if (aVar instanceof C12940a) {
                    if (m53516t()) {
                        ((C12940a) aVar).mo37983a();
                    }
                    this.f41906h.remove(cls);
                }
                if (aVar instanceof C12723a) {
                    if (m53514r()) {
                        ((C12723a) aVar).mo37628b();
                    }
                    this.f41909k.remove(cls);
                }
                if (aVar instanceof C12868a) {
                    if (m53515s()) {
                        ((C12868a) aVar).mo37885a();
                    }
                    this.f41912n.remove(cls);
                }
                aVar.onDetachedFromEngine(this.f41901c);
                this.f41899a.remove(cls);
            } finally {
                C12169e.m58446d();
            }
        }
    }

    /* renamed from: v */
    public void mo34108v(Set<Class<? extends C12502a>> set) {
        for (Class<? extends C12502a> u : set) {
            mo34107u(u);
        }
    }

    /* renamed from: w */
    public void mo34109w() {
        mo34108v(new HashSet(this.f41899a.keySet()));
        this.f41899a.clear();
    }
}
