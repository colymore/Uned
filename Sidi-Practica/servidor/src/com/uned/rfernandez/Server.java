package com.uned.rfernandez;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UID;

import com.uned.rfernandez.services.data.model.SignUpException;

interface Server extends Remote {
	String NAME = "Server";

	UID singUpClient(String name, String password) throws RemoteException, SignUpException;

	boolean loginClient(String uniqueId, String password) throws RemoteException;

	UID singUpRepository(String name, String password) throws RemoteException, SignUpException;

	boolean loginRepository(String uniqueId, String password) throws RemoteException;
}
