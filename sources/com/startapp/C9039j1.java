package com.startapp;

import android.bluetooth.BluetoothDevice;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.startapp.j1 */
/* compiled from: Sta */
public class C9039j1 {

    /* renamed from: a */
    public Set<BluetoothDevice> f36979a;

    /* renamed from: b */
    public Set<BluetoothDevice> f36980b;

    /* renamed from: a */
    public JSONObject mo29501a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Set<BluetoothDevice> set = this.f36979a;
            if (set != null && set.size() > 0) {
                jSONObject.put("paired", mo29500a(this.f36979a));
            }
            Set<BluetoothDevice> set2 = this.f36980b;
            if (set2 != null && set2.size() > 0) {
                jSONObject.put("available", mo29500a(this.f36980b));
            }
        } catch (Exception unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    /* renamed from: a */
    public final JSONArray mo29500a(Set<BluetoothDevice> set) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (BluetoothDevice next : set) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bluetoothClass", next.getBluetoothClass().getDeviceClass());
                jSONObject.put(MediationMetaData.KEY_NAME, next.getName());
                jSONObject.put("mac", next.getAddress());
                jSONObject.put("bondState", next.getBondState());
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }
}
