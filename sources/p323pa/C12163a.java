package p323pa;

import android.content.Context;
import com.unity3d.ads.metadata.MetaData;
import java.util.Map;

/* renamed from: pa.a */
/* compiled from: PrivacyConsent */
public class C12163a {

    /* renamed from: a */
    private Context f45257a;

    /* renamed from: a */
    private String m58428a(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1062165910:
                if (str.equals("ageGate")) {
                    c = 0;
                    break;
                }
                break;
            case 3048017:
                if (str.equals("ccpa")) {
                    c = 1;
                    break;
                }
                break;
            case 3168159:
                if (str.equals("gdpr")) {
                    c = 2;
                    break;
                }
                break;
            case 3441077:
                if (str.equals("pipl")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "privacy.useroveragelimit";
            case 1:
                return "privacy.consent";
            case 2:
                return "gdpr.consent";
            case 3:
                return "pipl.consent";
            default:
                return str;
        }
    }

    /* renamed from: b */
    public boolean mo36682b(Map<?, ?> map) {
        MetaData metaData = new MetaData(this.f45257a);
        boolean z = metaData.set(m58428a((String) map.get("privacyConsent_type")), (Object) (Boolean) map.get("privacyConsent_value"));
        metaData.commit();
        return z;
    }

    /* renamed from: c */
    public void mo36683c(Context context) {
        this.f45257a = context;
    }
}
