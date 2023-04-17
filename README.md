Desafio 4

o projeto myconfig possui uma API que retorna um valor na tela:
"CONFIG_MAP_VALUE: DEFAULT"

No entanto, é necessário que essa aplicação imprima na tela o valor:
"CONFIG_MAP_VALUE: CONFIG-MAP"

A aplicação possui uma chave "CONFIG_MAP_VALUE", que tem um valor "DEFAULT".

A aplicação deverá exibir a mensagem: "CONFIG_MAP_VALUE: CONFIG-MAP"

oc new-project myconfig

oc new-app --name=value https://github.com/leandroppereira/desafio4

oc logs -f build/value-1


oc create configmap my-config --from-literal=key1=config1

oc set env --from=configmap/my-config dc/myapp
