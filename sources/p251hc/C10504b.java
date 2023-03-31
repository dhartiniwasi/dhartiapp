package p251hc;

import com.google.firebase.firestore.C7923m;

/* renamed from: hc.b */
/* compiled from: ServerTimestampBehaviorConverter */
public class C10504b {
    /* renamed from: a */
    public static C7923m.C7924a m52899a(String str) {
        if (str == null) {
            return C7923m.C7924a.NONE;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1959779032) {
            if (hashCode != -1273775369) {
                if (hashCode == 3387192 && str.equals("none")) {
                    c = 2;
                }
            } else if (str.equals("previous")) {
                c = 1;
            }
        } else if (str.equals("estimate")) {
            c = 0;
        }
        if (c == 0) {
            return C7923m.C7924a.ESTIMATE;
        }
        if (c != 1) {
            return C7923m.C7924a.NONE;
        }
        return C7923m.C7924a.PREVIOUS;
    }
}
