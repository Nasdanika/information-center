package org.nasdanika.informationcenter;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.Realm;
import org.nasdanika.cdo.security.LoginPasswordCredentials;

public class CDOTransactionContextProviderComponent extends org.nasdanika.cdo.CDOTransactionContextProviderComponent<LoginPasswordCredentials> {
	
	@SuppressWarnings("unchecked")
	@Override
	protected Realm<LoginPasswordCredentials> getSecurityRealm(CDOTransaction view) {
		String resourcePath = "InformationCenter";
		if (view.hasResource(resourcePath)) {
			CDOResource res = view.getResource(resourcePath);
			if (res!=null) {
				for (EObject e: res.getContents()) {
					if (e instanceof Realm) {
						return (Realm<LoginPasswordCredentials>) e;
					}
				}
			}
		}
		return null;
	}

}
