package com.startapp;

import com.startapp.networkTest.enums.MultiSimVariants;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.startapp.z6 */
/* compiled from: Sta */
public class C9678z6 implements Cloneable {
    public int ActiveSimCount = -1;
    public int ActiveSimCountMax = -1;
    public int DefaultDataSimId = -1;
    public int DefaultSimId = -1;
    public int DefaultSmsSimId = -1;
    public int DefaultVoiceSimId = -1;
    public MultiSimVariants MultiSimVariant = MultiSimVariants.Unknown;
    @C9226pb(type = ArrayList.class, value = C9662y9.class)
    public ArrayList<C9662y9> SimInfos = new ArrayList<>();

    public C9662y9 getDefaultDataSimInfo() {
        Iterator<C9662y9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C9662y9 next = it.next();
            if (next.SubscriptionId == this.DefaultDataSimId) {
                return next;
            }
        }
        return new C9662y9();
    }

    public C9662y9 getDefaultSmsSimInfo() {
        Iterator<C9662y9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C9662y9 next = it.next();
            if (next.SubscriptionId == this.DefaultSmsSimId) {
                return next;
            }
        }
        return new C9662y9();
    }

    public C9662y9 getDefaultVoiceSimInfo() {
        Iterator<C9662y9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C9662y9 next = it.next();
            if (next.SubscriptionId == this.DefaultVoiceSimId) {
                return next;
            }
        }
        return new C9662y9();
    }

    public C9662y9 getSimInfoSubId(int i) {
        Iterator<C9662y9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            C9662y9 next = it.next();
            if (next.SubscriptionId == i) {
                return next;
            }
        }
        return new C9662y9();
    }
}
