package com.unity3d.services.core.configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class ExperimentObjects extends ExperimentsBase {
    private final Map<String, ExperimentObject> _experimentObjects = new HashMap();
    private final JSONObject _experimentObjetsData;

    public ExperimentObjects(JSONObject jSONObject) {
        if (jSONObject != null) {
            this._experimentObjetsData = jSONObject;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this._experimentObjects.put(next, new ExperimentObject(jSONObject.optJSONObject(next)));
            }
            return;
        }
        this._experimentObjetsData = new JSONObject();
    }

    private boolean getExperimentValue(String str, boolean z) {
        ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getBooleanValue() : z;
    }

    private boolean getExperimentValueOrDefault(String str) {
        return getExperimentValue(str, false);
    }

    private JSONObject getExperimentWithAppliedRule(ExperimentAppliedRule experimentAppliedRule) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this._experimentObjects.entrySet()) {
            if (((ExperimentObject) next.getValue()).getAppliedRule() == experimentAppliedRule) {
                hashMap.put(next.getKey(), String.valueOf(((ExperimentObject) next.getValue()).getBooleanValue()));
            }
        }
        return new JSONObject(hashMap);
    }

    public JSONObject getCurrentSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.IMMEDIATE);
    }

    public ExperimentObject getExperimentObject(String str) {
        return this._experimentObjects.get(str);
    }

    public Map<String, String> getExperimentTags() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this._experimentObjects.entrySet()) {
            hashMap.put(next.getKey(), String.valueOf(((ExperimentObject) next.getValue()).getBooleanValue()));
        }
        return hashMap;
    }

    public JSONObject getExperimentsAsJson() {
        return this._experimentObjetsData;
    }

    public JSONObject getNextSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.NEXT);
    }

    public boolean isForwardExperimentsToWebViewEnabled() {
        return getExperimentValueOrDefault("fff");
    }

    public boolean isNativeTokenEnabled() {
        return getExperimentValue("tsi_nt", true);
    }

    public boolean isNativeWebViewCacheEnabled() {
        return getExperimentValueOrDefault("nwc");
    }

    public boolean isNewLifecycleTimer() {
        return getExperimentValueOrDefault("nlt");
    }

    public boolean isPrivacyRequestEnabled() {
        return getExperimentValue("tsi_prr", true);
    }

    public boolean isTwoStageInitializationEnabled() {
        return getExperimentValue("tsi", true);
    }

    public boolean isUpdatePiiFields() {
        return getExperimentValueOrDefault("tsi_upii");
    }

    public boolean isWebAssetAdCaching() {
        return getExperimentValueOrDefault("wac");
    }

    public boolean isWebGestureNotRequired() {
        return getExperimentValueOrDefault("wgr");
    }

    public boolean shouldNativeTokenAwaitPrivacy() {
        return getExperimentValueOrDefault("tsi_prw");
    }
}
