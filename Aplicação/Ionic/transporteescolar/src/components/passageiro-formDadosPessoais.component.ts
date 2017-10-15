import {Component, Input} from "@angular/core"

@Component({
    selector: 'component-passageiro-formDadosPessoais',
    templateUrl: 'passageiro-formDadosPessoais.component.html',
})

export class PassageiroFormDadosPessoaisComponent{   

    _passageiro: any;

    @Input()
    set passageiro(passageiro){
        this._passageiro = passageiro;
    }

    get passageiro(){
        return this._passageiro;
    }
}