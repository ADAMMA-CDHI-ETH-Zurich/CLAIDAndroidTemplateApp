/***************************************************************************
* Copyright (C) 2023 ETH Zurich
* CLAID: Closing the Loop on AI & Data Collection (https://claid.ethz.ch)
* Core AI & Digital Biomarker, Acoustic and Inflammatory Biomarkers (ADAMMA)
* Centre for Digital Health Interventions (c4dhi.org)
* 
* Authors: Patrick Langer
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*         http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
***************************************************************************/

package adamma.c4dhi.claid.demo_app;
import android.app.Application;
import adamma.c4dhi.claid_android.Configuration.CLAIDPersistanceConfig;
import adamma.c4dhi.claid_android.Configuration.CLAIDSpecialPermissionsConfig;
import adamma.c4dhi.claid_platform_impl.CLAID;

public class MyApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();

        CLAID.startInBackground(
                getApplicationContext(),
                "assets://claid_config.json", // Path to config file
                "Smartphone",    // Host name
                "user01",        // Unique user id
                "my_device",     // Device name
                CLAIDSpecialPermissionsConfig.allStorageAccessConfig(),
                CLAIDPersistanceConfig.maximumPersistance()
        );
    }
}
