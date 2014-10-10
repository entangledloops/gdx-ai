/*******************************************************************************
 * Copyright 2014 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.ai.btree.decorator;

import com.badlogic.gdx.ai.btree.Decorator;
import com.badlogic.gdx.ai.btree.Node;

/** An AlwaysFail Decorator will fail no matter the wrapped node fails or succeeds.
 * 
 * @param <E> type of the blackboard nodes use to read or modify game state
 * 
 * @author implicit-invocation */
public class AlwaysFail<E> extends Decorator<E> {

	public AlwaysFail () {
	}

	public AlwaysFail (Node<E> node) {
		super(node);
	}

	@Override
	public void childSuccess (Node<E> runningNode) {
		control.childFail(this);
	}

	@Override
	public void childFail (Node<E> runningNode) {
		control.childFail(this);
	}

}