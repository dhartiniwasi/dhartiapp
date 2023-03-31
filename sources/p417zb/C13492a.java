package p417zb;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6568r;
import p264io.flutter.embedding.engine.FlutterJNI;
import p264io.flutter.view.C11069c;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.a */
/* compiled from: AccessibilityChannel */
public class C13492a {

    /* renamed from: a */
    public final C6531a<Object> f47886a;

    /* renamed from: b */
    public final FlutterJNI f47887b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C13494b f47888c;

    /* renamed from: d */
    final C6531a.C6536d<Object> f47889d;

    /* renamed from: zb.a$a */
    /* compiled from: AccessibilityChannel */
    class C13493a implements C6531a.C6536d<Object> {
        C13493a() {
        }

        /* renamed from: a */
        public void mo22133a(Object obj, C6531a.C6537e<Object> eVar) {
            if (C13492a.this.f47888c == null) {
                eVar.mo22131a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get(JsonStorageKeyNames.DATA_KEY);
            C11881b.m57388f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        C13492a.this.f47888c.mo34853e(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        C13492a.this.f47888c.mo34852d(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        C13492a.this.f47888c.mo34851c(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        C13492a.this.f47888c.mo34854f(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.mo22131a(null);
        }
    }

    /* renamed from: zb.a$b */
    /* compiled from: AccessibilityChannel */
    public interface C13494b extends FlutterJNI.C10682a {
        /* renamed from: c */
        void mo34851c(int i);

        /* renamed from: d */
        void mo34852d(String str);

        /* renamed from: e */
        void mo34853e(String str);

        /* renamed from: f */
        void mo34854f(int i);
    }

    public C13492a(C12051a aVar, FlutterJNI flutterJNI) {
        C13493a aVar2 = new C13493a();
        this.f47889d = aVar2;
        C6531a<Object> aVar3 = new C6531a<>(aVar, "flutter/accessibility", C6568r.f31011a);
        this.f47886a = aVar3;
        aVar3.mo22129e(aVar2);
        this.f47887b = flutterJNI;
    }

    /* renamed from: b */
    public void mo38621b(int i, C11069c.C11076g gVar) {
        this.f47887b.dispatchSemanticsAction(i, gVar);
    }

    /* renamed from: c */
    public void mo38622c(int i, C11069c.C11076g gVar, Object obj) {
        this.f47887b.dispatchSemanticsAction(i, gVar, obj);
    }

    /* renamed from: d */
    public void mo38623d() {
        this.f47887b.setSemanticsEnabled(false);
    }

    /* renamed from: e */
    public void mo38624e() {
        this.f47887b.setSemanticsEnabled(true);
    }

    /* renamed from: f */
    public void mo38625f(int i) {
        this.f47887b.setAccessibilityFeatures(i);
    }

    /* renamed from: g */
    public void mo38626g(C13494b bVar) {
        this.f47888c = bVar;
        this.f47887b.setAccessibilityDelegate(bVar);
    }
}
