# Nasdanika Information Center
A web application for serving Nasdanika Foundation Server documentation. 
It can also be configured to host ECore model documentation for user-provided models.

## Set up
* Clone the repository or download the zip file and unzip.
* ``mvn clean verify`` in ``org.nasdanika.informationcenter.aggregator`` project.
* Navigate to ``org.nasdanika.informationcenter.repository`` project, ``target/products/org.nasdanika.informationcenter.product/<platform specific>`` product folder, e.g.``target\products\org.nasdanika.informationcenter.product\win32\win32\x86_64`` on Windows 64.
* Launch eclipse executable, e.g. ``eclipse.exe`` on Windows.
* Open http://localhost:8080/information-center/index.html in a web browser.    

## Hosting documentation of user-provided models
* Add documentation annotations to your models. You can use plain text or markdown. See ``Nasdanika Foundation  Server / Web / CDO / Documentation Authoring`` topic in the Information Center for detailed information.
* In the ``.genmodel`` file set "Suppress GenModel Annotations" to ``false``.
* Re-generate model code. 
* Add model bundles to the ``org.nasdanika.informationcenter.feature/feature.xml`` file.
* Build and launch the product.
* Open documentation page in the browser - you should see documentation for your models under ``Packages/Global``.  
