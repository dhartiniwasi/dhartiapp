package p417zb;

import android.view.KeyEvent;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6531a;
import p186ac.C6539c;
import p186ac.C6551f;
import p297mb.C11881b;

/* renamed from: zb.d */
/* compiled from: KeyEventChannel */
public class C13498d {

    /* renamed from: a */
    public final C6531a<Object> f47897a;

    /* renamed from: zb.d$a */
    /* compiled from: KeyEventChannel */
    public interface C13499a {
        /* renamed from: a */
        void mo33980a(boolean z);
    }

    /* renamed from: zb.d$b */
    /* compiled from: KeyEventChannel */
    public static class C13500b {

        /* renamed from: a */
        public final KeyEvent f47898a;

        /* renamed from: b */
        public final Character f47899b;

        public C13500b(KeyEvent keyEvent, Character ch) {
            this.f47898a = keyEvent;
            this.f47899b = ch;
        }
    }

    public C13498d(C6539c cVar) {
        this.f47897a = new C6531a<>(cVar, "flutter/keyevent", C6551f.f30997a);
    }

    /* renamed from: b */
    private static C6531a.C6537e<Object> m62630b(C13499a aVar) {
        return new C13497c(aVar);
    }

    /* renamed from: c */
    private Map<String, Object> m62631c(C13500b bVar, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        hashMap.put("flags", Integer.valueOf(bVar.f47898a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f47898a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f47898a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f47898a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f47898a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f47898a.getMetaState()));
        Character ch = bVar.f47899b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f47898a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f47898a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f47898a.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m62632d(C13499a aVar, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                C11881b.m57384b("KeyEventChannel", "Unable to unpack JSON message: " + e);
            }
        }
        aVar.mo33980a(z);
    }

    /* renamed from: e */
    public void mo38628e(C13500b bVar, boolean z, C13499a aVar) {
        this.f47897a.mo22128d(m62631c(bVar, z), m62630b(aVar));
    }
}
