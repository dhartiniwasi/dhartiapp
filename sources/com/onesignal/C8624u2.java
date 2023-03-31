package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.onesignal.u2 */
/* compiled from: OSTaskRemoteController */
class C8624u2 extends C8616t2 {

    /* renamed from: f */
    static final HashSet<String> f36064f = new HashSet<>(Arrays.asList(new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));

    /* renamed from: e */
    private final C8461i2 f36065e;

    C8624u2(C8461i2 i2Var, C8547p1 p1Var) {
        super(p1Var);
        this.f36065e = i2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo28238g(String str) {
        return !this.f36065e.mo27853l() && f36064f.contains(str);
    }
}
