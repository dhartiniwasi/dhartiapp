package p260ib;

import android.app.Activity;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p186ac.C6539c;
import p217de.mintware.barcode_scan.ChannelHandler;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: ib.b */
/* compiled from: BarcodeScanPlugin.kt */
public final class C10574b implements C12502a, C12588a {

    /* renamed from: c */
    public static final C10575a f41617c = new C10575a((C11665g) null);

    /* renamed from: a */
    private ChannelHandler f41618a;

    /* renamed from: b */
    private C10572a f41619b;

    /* renamed from: ib.b$a */
    /* compiled from: BarcodeScanPlugin.kt */
    public static final class C10575a {
        private C10575a() {
        }

        public /* synthetic */ C10575a(C11665g gVar) {
            this();
        }
    }

    public void onAttachedToActivity(C12590c cVar) {
        C11669k.m56787e(cVar, "binding");
        if (this.f41618a != null) {
            C10572a aVar = this.f41619b;
            C11669k.m56784b(aVar);
            cVar.mo34111a(aVar);
            C10572a aVar2 = this.f41619b;
            C11669k.m56784b(aVar2);
            cVar.mo34112b(aVar2);
            C10572a aVar3 = this.f41619b;
            C11669k.m56784b(aVar3);
            aVar3.mo33771b(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "flutterPluginBinding");
        C10572a aVar = new C10572a(bVar.mo37292a(), (Activity) null, 2, (C11665g) null);
        this.f41619b = aVar;
        C11669k.m56784b(aVar);
        ChannelHandler channelHandler = new ChannelHandler(aVar);
        this.f41618a = channelHandler;
        C11669k.m56784b(channelHandler);
        C6539c b = bVar.mo37293b();
        C11669k.m56786d(b, "flutterPluginBinding.binaryMessenger");
        channelHandler.mo32521b(b);
    }

    public void onDetachedFromActivity() {
        if (this.f41618a != null) {
            C10572a aVar = this.f41619b;
            C11669k.m56784b(aVar);
            aVar.mo33771b((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        ChannelHandler channelHandler = this.f41618a;
        if (channelHandler != null) {
            C11669k.m56784b(channelHandler);
            channelHandler.mo32522c();
            this.f41618a = null;
            this.f41619b = null;
        }
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        C11669k.m56787e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
