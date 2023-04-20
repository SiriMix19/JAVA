class Person:
    # Public Attribute
    name = "John"
    
    # Private Attribute
    _age = 30
    
    # Public Method
    def get_name(self):
        return self.name
    
    # Private Method
    def _get_age(self):
        return self._age
    