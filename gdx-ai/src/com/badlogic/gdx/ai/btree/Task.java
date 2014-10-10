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

package com.badlogic.gdx.ai.btree;

/** Leaf node of a behavior tree, contains action or condition logic, can not have any child.
 * 
 * @param <E> type of the blackboard nodes use to read or modify game state
 * 
 * @author implicit-invocation
 * @author davebaol */
public abstract class Task<E> extends Node<E> {

	@Override
	public void addChild (Node<E> node) {
		// TODO Should we throw an exception?
		// throw new UnsupportedOperationException();
	}

	@Override
	public int getChildCount () {
		return 0;
	}

	@Override
	public Node<E> getChild (int i) {
		return null;
	}

	@Override
	public final void childRunning (Node<E> runningNode, Node<E> reporter) {
	}

	@Override
	public final void childFail (Node<E> runningNode) {
	}

	@Override
	public final void childSuccess (Node<E> runningNode) {
	}

}