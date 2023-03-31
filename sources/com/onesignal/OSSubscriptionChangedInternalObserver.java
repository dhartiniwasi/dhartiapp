package com.onesignal;

class OSSubscriptionChangedInternalObserver {
    OSSubscriptionChangedInternalObserver() {
    }

    /* renamed from: a */
    static void m46156a(OSSubscriptionState oSSubscriptionState) {
        if (C8338d3.m46440K0().mo27630c(new C8579q2(C8338d3.f35443h0, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            C8338d3.f35443h0 = oSSubscriptionState2;
            oSSubscriptionState2.mo27550g();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        m46156a(oSSubscriptionState);
    }
}
