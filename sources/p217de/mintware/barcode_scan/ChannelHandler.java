package p217de.mintware.barcode_scan;

import android.hardware.Camera;
import androidx.annotation.Keep;
import com.google.protobuf.C8260z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.C11669k;
import p186ac.C6539c;
import p186ac.C6544d;
import p186ac.C6555j;
import p186ac.C6556k;
import p243gd.C10346p;
import p260ib.C10572a;
import p260ib.C10577d;
import p260ib.C10581f;

/* renamed from: de.mintware.barcode_scan.ChannelHandler */
/* compiled from: ChannelHandler.kt */
public final class ChannelHandler implements C6556k.C6560c, C6544d.C6549d {

    /* renamed from: a */
    private final C10572a f39883a;

    /* renamed from: b */
    private C6556k f39884b;

    /* renamed from: c */
    private C6544d f39885c;

    /* renamed from: d */
    private C6544d.C6546b f39886d;

    /* renamed from: e */
    private final HashMap<String, Method> f39887e = new HashMap<>();

    public ChannelHandler(C10572a aVar) {
        C11669k.m56787e(aVar, "activityHelper");
        this.f39883a = aVar;
    }

    /* renamed from: a */
    private final void m50948a() {
        Method[] declaredMethods = ChannelHandler.class.getDeclaredMethods();
        C11669k.m56786d(declaredMethods, "m");
        for (Method method : declaredMethods) {
            HashMap<String, Method> hashMap = this.f39887e;
            String name = method.getName();
            C11669k.m56786d(name, "method.name");
            C11669k.m56786d(method, "method");
            hashMap.put(name, method);
        }
    }

    /* renamed from: b */
    public final void mo32521b(C6539c cVar) {
        C11669k.m56787e(cVar, "messenger");
        if (this.f39884b != null) {
            mo32522c();
        }
        C6556k kVar = new C6556k(cVar, "de.mintware.barcode_scan");
        kVar.mo22161e(this);
        this.f39884b = kVar;
        if (this.f39885c != null) {
            mo32522c();
        }
        C6544d dVar = new C6544d(cVar, "de.mintware.barcode_scan/events");
        dVar.mo22141d(this);
        this.f39885c = dVar;
    }

    /* renamed from: c */
    public final void mo32522c() {
        C6556k kVar = this.f39884b;
        if (kVar != null) {
            C11669k.m56784b(kVar);
            kVar.mo22161e((C6556k.C6560c) null);
            this.f39884b = null;
        }
        C6544d dVar = this.f39885c;
        if (dVar != null) {
            C11669k.m56784b(dVar);
            dVar.mo22141d((C6544d.C6549d) null);
            this.f39885c = null;
        }
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        this.f39886d = bVar;
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        this.f39886d = null;
    }

    @Keep
    public final void numberOfCameras(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        dVar.success(Integer.valueOf(Camera.getNumberOfCameras()));
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        if (this.f39887e.isEmpty()) {
            m50948a();
        }
        Method method = this.f39887e.get(jVar.f30999a);
        if (method == null) {
            dVar.notImplemented();
            return;
        }
        try {
            method.invoke(this, Arrays.copyOf(new Object[]{jVar, dVar}, 2));
        } catch (Exception e) {
            dVar.error(jVar.f30999a, e.getMessage(), e);
        }
    }

    @Keep
    public final void requestCameraPermission(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        dVar.success(Boolean.valueOf(this.f39883a.mo33770a(this.f39886d)));
    }

    @Keep
    public final void scan(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        C8260z p = C10581f.m53154p0().mo33785E(C10508b0.m52915g(C10346p.m52247a("cancel", "Cancel"), C10346p.m52247a("flash_on", "Flash on"), C10346p.m52247a("flash_off", "Flash off"))).mo33786F(C10577d.m53132g0().mo33775D(0.5d).mo33776E(true)).mo33784D(new ArrayList()).mo33787G(-1).build();
        C11669k.m56786d(p, "newBuilder()\n           …\n                .build()");
        C10581f fVar = (C10581f) p;
        Object obj = jVar.f31000b;
        if (obj instanceof byte[]) {
            C11669k.m56785c(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            fVar = C10581f.m53155q0((byte[]) obj);
            C11669k.m56786d(fVar, "parseFrom(call.arguments as ByteArray)");
        }
        this.f39883a.mo33772c(dVar, fVar);
    }
}
