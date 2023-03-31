package p264io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
import p297mb.C11881b;

/* renamed from: io.flutter.plugin.editing.e */
/* compiled from: TextEditingDelta */
public final class C10709e {

    /* renamed from: a */
    private CharSequence f41970a;

    /* renamed from: b */
    private CharSequence f41971b;

    /* renamed from: c */
    private int f41972c;

    /* renamed from: d */
    private int f41973d;

    /* renamed from: e */
    private int f41974e;

    /* renamed from: f */
    private int f41975f;

    /* renamed from: g */
    private int f41976g;

    /* renamed from: h */
    private int f41977h;

    public C10709e(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, int i4, int i5, int i6) {
        this.f41974e = i3;
        this.f41975f = i4;
        this.f41976g = i5;
        this.f41977h = i6;
        m53585a(charSequence, charSequence2.toString(), i, i2);
    }

    /* renamed from: a */
    private void m53585a(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        this.f41970a = charSequence;
        this.f41971b = charSequence2;
        this.f41972c = i;
        this.f41973d = i2;
    }

    /* renamed from: b */
    public JSONObject mo34199b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f41970a.toString());
            jSONObject.put("deltaText", this.f41971b.toString());
            jSONObject.put("deltaStart", this.f41972c);
            jSONObject.put("deltaEnd", this.f41973d);
            jSONObject.put("selectionBase", this.f41974e);
            jSONObject.put("selectionExtent", this.f41975f);
            jSONObject.put("composingBase", this.f41976g);
            jSONObject.put("composingExtent", this.f41977h);
        } catch (JSONException e) {
            C11881b.m57384b("TextEditingDelta", "unable to create JSONObject: " + e);
        }
        return jSONObject;
    }

    public C10709e(CharSequence charSequence, int i, int i2, int i3, int i4) {
        this.f41974e = i;
        this.f41975f = i2;
        this.f41976g = i3;
        this.f41977h = i4;
        m53585a(charSequence, "", -1, -1);
    }
}
