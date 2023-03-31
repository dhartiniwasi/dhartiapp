package p417zb;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6552g;
import p186ac.C6555j;
import p186ac.C6556k;
import p264io.flutter.plugin.editing.C10709e;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.p */
/* compiled from: TextInputChannel */
public class C13543p {

    /* renamed from: a */
    public final C6556k f48023a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13550f f48024b;

    /* renamed from: c */
    final C6556k.C6560c f48025c;

    /* renamed from: zb.p$a */
    /* compiled from: TextInputChannel */
    class C13544a implements C6556k.C6560c {
        C13544a() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            Bundle bundle;
            C6555j jVar2 = jVar;
            C6556k.C6561d dVar2 = dVar;
            if (C13543p.this.f48024b != null) {
                String str = jVar2.f30999a;
                Object obj = jVar2.f31000b;
                C11881b.m57388f("TextInputChannel", "Received '" + str + "' message.");
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c = 9;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            C13543p.this.f48024b.mo34217d(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e) {
                            dVar2.error("error", e.getMessage(), (Object) null);
                            return;
                        }
                    case 1:
                        try {
                            C13543p.this.f48024b.mo34216c(C13549e.m62753a((JSONObject) obj));
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e2) {
                            dVar2.error("error", e2.getMessage(), (Object) null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            C13543p.this.f48024b.mo34215b(jSONArray.getInt(0), C13545b.m62747a(jSONArray.getJSONObject(1)));
                            dVar2.success((Object) null);
                            return;
                        } catch (NoSuchFieldException | JSONException e3) {
                            dVar2.error("error", e3.getMessage(), (Object) null);
                            return;
                        }
                    case 3:
                        C13543p.this.f48024b.mo34222i();
                        dVar2.success((Object) null);
                        return;
                    case 4:
                        C13543p.this.f48024b.show();
                        dVar2.success((Object) null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString(JsonStorageKeyNames.DATA_KEY);
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString(JsonStorageKeyNames.DATA_KEY, string2);
                            }
                            C13543p.this.f48024b.mo34214a(string, bundle);
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e4) {
                            dVar2.error("error", e4.getMessage(), (Object) null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d = jSONObject3.getDouble("width");
                            double d2 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i = 0; i < 16; i++) {
                                dArr[i] = jSONArray2.getDouble(i);
                            }
                            C13543p.this.f48024b.mo34218e(d, d2, dArr);
                            dVar2.success((Object) null);
                            return;
                        } catch (JSONException e5) {
                            dVar2.error("error", e5.getMessage(), (Object) null);
                            return;
                        }
                    case 7:
                        C13543p.this.f48024b.mo34220g(((Boolean) obj).booleanValue());
                        dVar2.success((Object) null);
                        return;
                    case 8:
                        C13543p.this.f48024b.mo34221h();
                        dVar2.success((Object) null);
                        return;
                    case 9:
                        C13543p.this.f48024b.mo34219f();
                        dVar2.success((Object) null);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    /* renamed from: zb.p$b */
    /* compiled from: TextInputChannel */
    public static class C13545b {

        /* renamed from: a */
        public final boolean f48027a;

        /* renamed from: b */
        public final boolean f48028b;

        /* renamed from: c */
        public final boolean f48029c;

        /* renamed from: d */
        public final boolean f48030d;

        /* renamed from: e */
        public final boolean f48031e;

        /* renamed from: f */
        public final C13548d f48032f;

        /* renamed from: g */
        public final C13547c f48033g;

        /* renamed from: h */
        public final Integer f48034h;

        /* renamed from: i */
        public final String f48035i;

        /* renamed from: j */
        public final C13546a f48036j;

        /* renamed from: k */
        public final String[] f48037k;

        /* renamed from: l */
        public final C13545b[] f48038l;

        /* renamed from: zb.p$b$a */
        /* compiled from: TextInputChannel */
        public static class C13546a {

            /* renamed from: a */
            public final String f48039a;

            /* renamed from: b */
            public final String[] f48040b;

            /* renamed from: c */
            public final C13549e f48041c;

            /* renamed from: d */
            public final String f48042d;

            public C13546a(String str, String[] strArr, String str2, C13549e eVar) {
                this.f48039a = str;
                this.f48040b = strArr;
                this.f48042d = str2;
                this.f48041c = eVar;
            }

            /* renamed from: a */
            public static C13546a m62749a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = m62750b(jSONArray.getString(i));
                }
                return new C13546a(string, strArr, string2, C13549e.m62753a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String m62750b(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p417zb.C13543p.C13545b.C13546a.m62750b(java.lang.String):java.lang.String");
            }
        }

        public C13545b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C13548d dVar, C13547c cVar, Integer num, String str, C13546a aVar, String[] strArr, C13545b[] bVarArr) {
            this.f48027a = z;
            this.f48028b = z2;
            this.f48029c = z3;
            this.f48030d = z4;
            this.f48031e = z5;
            this.f48032f = dVar;
            this.f48033g = cVar;
            this.f48034h = num;
            this.f48035i = str;
            this.f48036j = aVar;
            this.f48037k = strArr;
            this.f48038l = bVarArr;
        }

        /* renamed from: a */
        public static C13545b m62747a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            C13545b[] bVarArr;
            JSONArray jSONArray;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                C13546a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("fields");
                    int length = jSONArray2.length();
                    C13545b[] bVarArr2 = new C13545b[length];
                    for (int i = 0; i < length; i++) {
                        bVarArr2[i] = m62747a(jSONArray2.getJSONObject(i));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b = m62748b(string);
                ArrayList arrayList = new ArrayList();
                if (jSONObject2.isNull("contentCommitMimeTypes")) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject2.getJSONArray("contentCommitMimeTypes");
                }
                if (jSONArray != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(jSONArray.optString(i2));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                C13548d a = C13548d.m62752a(jSONObject2.getString("textCapitalization"));
                C13547c a2 = C13547c.m62751a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = C13546a.m62749a(jSONObject2.getJSONObject("autofill"));
                }
                return new C13545b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a, a2, b, string2, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer m62748b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p417zb.C13543p.C13545b.m62748b(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: zb.p$c */
    /* compiled from: TextInputChannel */
    public static class C13547c {

        /* renamed from: a */
        public final C13551g f48043a;

        /* renamed from: b */
        public final boolean f48044b;

        /* renamed from: c */
        public final boolean f48045c;

        public C13547c(C13551g gVar, boolean z, boolean z2) {
            this.f48043a = gVar;
            this.f48044b = z;
            this.f48045c = z2;
        }

        /* renamed from: a */
        public static C13547c m62751a(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new C13547c(C13551g.m62765a(jSONObject.getString(MediationMetaData.KEY_NAME)), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: zb.p$d */
    /* compiled from: TextInputChannel */
    public enum C13548d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: a */
        private final String f48051a;

        private C13548d(String str) {
            this.f48051a = str;
        }

        /* renamed from: a */
        static C13548d m62752a(String str) throws NoSuchFieldException {
            for (C13548d dVar : values()) {
                if (dVar.f48051a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: zb.p$e */
    /* compiled from: TextInputChannel */
    public static class C13549e {

        /* renamed from: a */
        public final String f48052a;

        /* renamed from: b */
        public final int f48053b;

        /* renamed from: c */
        public final int f48054c;

        /* renamed from: d */
        public final int f48055d;

        /* renamed from: e */
        public final int f48056e;

        public C13549e(String str, int i, int i2, int i3, int i4) throws IndexOutOfBoundsException {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            } else if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            } else if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            } else if (i2 <= str.length()) {
                this.f48052a = str;
                this.f48053b = i;
                this.f48054c = i2;
                this.f48055d = i3;
                this.f48056e = i4;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            }
        }

        /* renamed from: a */
        public static C13549e m62753a(JSONObject jSONObject) throws JSONException {
            return new C13549e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        /* renamed from: b */
        public boolean mo38671b() {
            int i = this.f48055d;
            return i >= 0 && this.f48056e > i;
        }

        /* renamed from: c */
        public boolean mo38672c() {
            return this.f48053b >= 0;
        }
    }

    /* renamed from: zb.p$f */
    /* compiled from: TextInputChannel */
    public interface C13550f {
        /* renamed from: a */
        void mo34214a(String str, Bundle bundle);

        /* renamed from: b */
        void mo34215b(int i, C13545b bVar);

        /* renamed from: c */
        void mo34216c(C13549e eVar);

        /* renamed from: d */
        void mo34217d(int i, boolean z);

        /* renamed from: e */
        void mo34218e(double d, double d2, double[] dArr);

        /* renamed from: f */
        void mo34219f();

        /* renamed from: g */
        void mo34220g(boolean z);

        /* renamed from: h */
        void mo34221h();

        /* renamed from: i */
        void mo34222i();

        void show();
    }

    /* renamed from: zb.p$g */
    /* compiled from: TextInputChannel */
    public enum C13551g {
        f48057b("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: a */
        private final String f48069a;

        private C13551g(String str) {
            this.f48069a = str;
        }

        /* renamed from: a */
        static C13551g m62765a(String str) throws NoSuchFieldException {
            for (C13551g gVar : values()) {
                if (gVar.f48069a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public C13543p(C12051a aVar) {
        C13544a aVar2 = new C13544a();
        this.f48025c = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/textinput", C6552g.f30998a);
        this.f48023a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* renamed from: c */
    private static HashMap<Object, Object> m62730c(ArrayList<C10709e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<C10709e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo34199b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    /* renamed from: d */
    private static HashMap<Object, Object> m62731d(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    /* renamed from: b */
    public void mo38656b(int i, Map<String, Object> map) {
        C11881b.m57388f("TextInputChannel", "Sending 'commitContent' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i), "TextInputAction.commitContent", map}));
    }

    /* renamed from: e */
    public void mo38657e(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'done' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.done"}));
    }

    /* renamed from: f */
    public void mo38658f(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'go' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.go"}));
    }

    /* renamed from: g */
    public void mo38659g(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'newline' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.newline"}));
    }

    /* renamed from: h */
    public void mo38660h(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'next' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.next"}));
    }

    /* renamed from: i */
    public void mo38661i(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(JsonStorageKeyNames.DATA_KEY, hashMap2);
        }
        this.f48023a.mo22159c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap}));
    }

    /* renamed from: j */
    public void mo38662j(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'previous' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.previous"}));
    }

    /* renamed from: k */
    public void mo38663k() {
        this.f48023a.mo22159c("TextInputClient.requestExistingInputState", (Object) null);
    }

    /* renamed from: l */
    public void mo38664l(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'search' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.search"}));
    }

    /* renamed from: m */
    public void mo38665m(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'send' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.send"}));
    }

    /* renamed from: n */
    public void mo38666n(C13550f fVar) {
        this.f48024b = fVar;
    }

    /* renamed from: o */
    public void mo38667o(int i) {
        C11881b.m57388f("TextInputChannel", "Sending 'unspecified' message.");
        this.f48023a.mo22159c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.unspecified"}));
    }

    /* renamed from: p */
    public void mo38668p(int i, String str, int i2, int i3, int i4, int i5) {
        C11881b.m57388f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        HashMap<Object, Object> d = m62731d(str, i2, i3, i4, i5);
        this.f48023a.mo22159c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i), d}));
    }

    /* renamed from: q */
    public void mo38669q(int i, ArrayList<C10709e> arrayList) {
        C11881b.m57388f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> c = m62730c(arrayList);
        this.f48023a.mo22159c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i), c}));
    }

    /* renamed from: r */
    public void mo38670r(int i, HashMap<String, C13549e> hashMap) {
        C11881b.m57388f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            C13549e eVar = (C13549e) next.getValue();
            hashMap2.put((String) next.getKey(), m62731d(eVar.f48052a, eVar.f48053b, eVar.f48054c, -1, -1));
        }
        this.f48023a.mo22159c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap2}));
    }
}
