package p350sa;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: sa.g */
/* compiled from: MainMethodCallHandler */
public class C12501g implements C6556k.C6560c {

    /* renamed from: a */
    private final Context f45953a;

    /* renamed from: b */
    private final C6539c f45954b;

    /* renamed from: c */
    private final Map<String, C12493d> f45955c = new HashMap();

    public C12501g(Context context, C6539c cVar) {
        this.f45953a = context;
        this.f45954b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37291a() {
        Iterator it = new ArrayList(this.f45955c.values()).iterator();
        while (it.hasNext()) {
            ((C12493d) it.next()).mo37289x0();
        }
        this.f45955c.clear();
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3237136:
                if (str.equals("init")) {
                    c = 0;
                    break;
                }
                break;
            case 1999985120:
                if (str.equals("disposePlayer")) {
                    c = 1;
                    break;
                }
                break;
            case 2146443344:
                if (str.equals("disposeAllPlayers")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String str2 = (String) jVar.mo22156a("id");
                if (this.f45955c.containsKey(str2)) {
                    dVar.error("Platform player " + str2 + " already exists", (String) null, (Object) null);
                    return;
                }
                String str3 = str2;
                this.f45955c.put(str2, new C12493d(this.f45953a, this.f45954b, str3, (Map) jVar.mo22156a("audioLoadConfiguration"), (List) jVar.mo22156a("androidAudioEffects"), (Boolean) jVar.mo22156a("androidOffloadSchedulingEnabled")));
                dVar.success((Object) null);
                return;
            case 1:
                String str4 = (String) jVar.mo22156a("id");
                C12493d dVar2 = this.f45955c.get(str4);
                if (dVar2 != null) {
                    dVar2.mo37289x0();
                    this.f45955c.remove(str4);
                }
                dVar.success(new HashMap());
                return;
            case 2:
                mo37291a();
                dVar.success(new HashMap());
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
