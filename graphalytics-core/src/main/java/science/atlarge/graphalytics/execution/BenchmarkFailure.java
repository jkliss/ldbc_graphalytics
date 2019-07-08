/*
 * Copyright 2015 - 2017 Atlarge Research Team,
 * operating at Technische Universiteit Delft
 * and Vrije Universiteit Amsterdam, the Netherlands.
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
 */
package science.atlarge.graphalytics.execution;

import java.io.Serializable;

/**
 * @author Mihai Capotă
 * @author Tim Hegeman
 * @author Wing Lung Ngai
 */
public enum BenchmarkFailure implements Serializable {

    DAT("dat", "dataset"),
    INI("ini", "initialization"),
    TIM("tim", "timeout"),
    EXE("exe", "execution"),
    COM("com", "completion"),
    VAL("val", "validation"),
    MET("met", "metric");

    public String id;
    public String type;

    BenchmarkFailure(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
